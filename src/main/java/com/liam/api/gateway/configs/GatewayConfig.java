package com.liam.api.gateway.configs;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
	
	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder) {
		
		return routeLocatorBuilder.routes()
				.route(p -> p.path("/employees/**")
						.uri("lb://EMPLOYEE-SERVICE"))
				.route(p -> p.path("/companies/**")
						.uri("lb://COMPANY-SERVICE"))
				.route(p -> p.path("/departments/**")
						.uri("lb://DEPARTMENT-SERVICE"))
				.build();
	}

}
