package com.lagm.nttdata.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringWebfluxGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebfluxGatewayApplication.class, args);
	}

}
