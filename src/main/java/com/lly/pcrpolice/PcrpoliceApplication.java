package com.lly.pcrpolice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PcrpoliceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcrpoliceApplication.class, args);
	}

}
