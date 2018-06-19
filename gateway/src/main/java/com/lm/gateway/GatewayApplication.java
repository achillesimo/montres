package com.lm.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients
@Configuration
@SpringBootApplication
public class GatewayApplication {
	@Bean
	RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder
				.routes()
				.route(
						r -> r.path("/api/users").uri("utilisateurs")
				)
				.route(
						r -> r.path("/suivis").uri("localhost:8083")
				)
				.route(
						r -> r.path("/stocks").uri("localhost:8082")
				)
				.route(
						r -> r.path("/stocks").uri("localhost:8081")
				)
				.build();
	}
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}
