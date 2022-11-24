package com.nodiac.bzl.UserManagementResource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserManagementResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementResourceApplication.class, args);
	}

}
