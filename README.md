# Eureka-Client
This sample is a part of a big project with Spring Boot which contains load balancing with Zuul.
I just want to show how to connect to Eureka as a client.

# Initial Setup
We need to set up Eureka server/client .

# Maven Configuration
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        <version>1.4.7.RELEASE</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>2.3.1.RELEASE</version>
    </dependency>

# Communication With Eureka

    @SpringBootApplication
    @EnableEurekaClient
    @RestController
      public class EurekaClientApplication  {
        public static void main(String[] args) {
            SpringApplication.run(EurekaClientApplication.class, args);
        }
     }

# application.yml
    eureka:
      client:
        serviceUrl:
          defaultZone: http://localhost:8761/eureka
