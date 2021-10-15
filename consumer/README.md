<!-- PROJECT SHIELDS -->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/gnlabrie/kafka-time-demo">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>
</p>

<h3 align="center">Kafka Time Demo Consumer</h3>

<p align="center">
   Demonstration of Kafka Consumer
   <br />
   <a href="https://github.com/gnlabrie/kafka-time-demo"><strong>Explore the docs »</strong></a>
   <br />
   <br />
   <a href="https://github.com/gnlabrie/kafka-time-demo/issues">Report Bug</a>
   ·
   <a href="https://github.com/gnlabrie/kafka-time-demo/issues">Request Feature</a>
</p>

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary><h2 style="display: inline-block">Table of Contents</h2></summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

[![Product Name Screen Shot][product-screenshot]](https://example.com)

### Built with ...

* Intellij Community
* Spring Boot Kafka
* Maven

<!-- GETTING STARTED -->
## Getting Started
To get a local copy up and running follow these simple steps.

### Prerequisites
* Java 11

### Installation
- Clone the repo
 ```sh
git clone https://github.com/gnlabrie/kafka-time-demo.git
```

### (Re)Build with Maven
- Build standalone jar with Maven
```sh
cd <clone-path>/consumer
mvn package -Dmaven.test.skip
```

<!-- USAGE EXAMPLES -->
## Usage

### Running Kafka Time Demo Consumer (standalone)
```shell
cd <clone-path>/consumer
java -jar target/consumer-0.0.1-SNAPSHOT.jar
```

### Update configuration
You could update the configuration of Kafka Time Demo Consumer by modifying the *application.yml* file

_For more examples, please refer to the [Documentation](https://example.com)_

<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/gnlabrie/kafka-time-demo/issues) for a list of proposed features (and known issues).

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.

<!-- CONTACT -->
## Contact

* Name : Guy Labrie
* Email: [guy.labrie@cgsc.ca](mailto:guy.labrie@cgsc.ca?subject=[GitHub]%20Source%20Han%20Sans)
* Project Link: [https://github.com/gnlabrie/kafka-time-demo](https://github.com/gnlabrie/kafka-time-demo)

<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements

* []()
* []()
* []()

## Donation
If you like the tool and want to support the code, you can pay me a coke ...

<a href="https://www.paypal.com/donate?business=XPAD6SVHRHTP2&no_recurring=0&currency_code=CAD" target=”_blank”><img src="https://github.com/gnlabrie/kafka-time-demo/blob/main/images/donate.png" align="left" height="10%" width="10%"></a>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/gnlabrie/kafka-time-demo?style=for-the-badge
[contributors-url]: https://github.com/gnlabrie/kafka-time-demo/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/gnlabrie/kafka-time-demo?style=for-the-badge
[forks-url]: https://github.com/gnlabrie/kafka-time-demo/network/members
[stars-shield]: https://img.shields.io/github/stars/gnlabrie/kafka-time-demo?style=for-the-badge
[stars-url]: https://github.com/gnlabrie/kafka-time-demo/stargazers
[issues-shield]: https://img.shields.io/github/issues/gnlabrie/kafka-time-demo?style=for-the-badge
[issues-url]: https://github.com/gnlabrie/kafka-time-demo/issues
[license-shield]: https://img.shields.io/github/license/gnlabrie/kafka-time-demo?style=for-the-badge
[license-url]: https://github.com/gnlabrie/kafka-time-demo/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/guy-labrie-3461463