package com.liam.api.gateway.configs;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
	
	public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder) {
		
		return routeLocatorBuilder.routes()
				.route(p -> p.path("/employees")
						.uri("http://localhost:9005"))
				.route(p -> p.path("/companies")
						.uri("http://localhost:9006"))
				.route(p -> p.path("/departments")
						.uri("http://localhost:9001"))
				.build();
	}

}
