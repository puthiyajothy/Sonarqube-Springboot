package com.sgic.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class RegistryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryserviceApplication.class, args);
	}

}
