package com.nttdata.mscreditpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsCreditPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCreditPayApplication.class, args);
	}

}
