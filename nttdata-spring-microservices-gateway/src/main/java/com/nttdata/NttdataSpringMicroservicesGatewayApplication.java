package com.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NttdataSpringMicroservicesGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttdataSpringMicroservicesGatewayApplication.class, args);
	}

}
