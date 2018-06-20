package com.lm.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayApplication {
/*
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(
                        r -> r.path("/api/users").uri("lb://utilisateurs")
                            .filters(f -> f.)
                )
                .build();
    }
*/
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
