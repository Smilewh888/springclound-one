package com.one.cloudconfignacos3377;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigNacos3377Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigNacos3377Application.class, args);
	}

}
