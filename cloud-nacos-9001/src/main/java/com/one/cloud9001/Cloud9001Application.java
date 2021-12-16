package com.one.cloud9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//加此注解
public class Cloud9001Application {

	public static void main(String[] args) {
		SpringApplication.run(Cloud9001Application.class, args);
	}

}
