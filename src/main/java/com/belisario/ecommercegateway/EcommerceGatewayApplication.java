package com.belisario.ecommercegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EcommerceGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceGatewayApplication.class, args);
	}

}
