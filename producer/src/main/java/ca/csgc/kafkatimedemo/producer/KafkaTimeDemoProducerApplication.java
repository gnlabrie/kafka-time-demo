package ca.csgc.kafkatimedemo.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class KafkaTimeDemoProducerApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTimeDemoProducerApplication.class, args);
	}

	private final Logger LOG = LoggerFactory.getLogger("ca.cgsc.KafkaTimeDemoProducerApplication");

	private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	private void KafkaTemplate(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	@Value("${time.topic.name:demo-time-topic}")
	private String topicName;

	@Value("${time.log.interval:60}")
	private int logInterval;

	@Override
	@SuppressWarnings("InfiniteLoopStatement")
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("You are here");
		// Send a Timestamp per second - closest to the second - 00:00:00, 00:00:01, etc.
		long millisWithinSecond;
		int cnt=0;
		String message;
		LOG.info("Starting Producer application.");
		while (true) {
			// Sleep until you are close to the second
			millisWithinSecond = 1000 - (System.currentTimeMillis() % 1000);
			LOG.debug("Sleeping {} ms.", millisWithinSecond);
			Thread.sleep(millisWithinSecond);
			LOG.debug("Sending Timestamp Message.");
			message = ZonedDateTime.now( ZoneOffset.UTC ).format( DateTimeFormatter.ISO_INSTANT );
			kafkaTemplate.send(topicName, message);
			LOG.debug("Message [{}] sent.", message);
			cnt++;
			if ( (cnt % logInterval) == 0 ) {
				LOG.info("Produced {} messages", logInterval);
				cnt=0;
			}
		}
	}
}