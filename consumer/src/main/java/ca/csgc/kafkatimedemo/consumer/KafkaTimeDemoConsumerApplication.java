package ca.csgc.kafkatimedemo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

@SpringBootApplication
public class KafkaTimeDemoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTimeDemoConsumerApplication.class, args);
	}

	Logger LOG = LoggerFactory.getLogger("ca.cgsc.KafkaTimeDemoConsumerApplication");

	@Value("${time.log.interval:60}")
	private int logInterval;

	private int cnt=0;

	@KafkaListener(topics = "#{'${time.topic.name}'.split('\\\\ ')}", groupId = "${spring.kafka.consumer.group-id}")
	void listener(@Payload String message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition, @Header(KafkaHeaders.OFFSET) int offset) {
		LOG.debug("Received message [{}] from partition-{} with offset-{}", message, partition, offset);
		cnt++;
		if ( (cnt % logInterval) == 0 ) {
			LOG.info("Consumed {} messages", logInterval);
			cnt=0;
		}
	}
}
