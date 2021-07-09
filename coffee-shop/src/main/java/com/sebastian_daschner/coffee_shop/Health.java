package com.sebastian_daschner.coffee_shop;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.enterprise.context.ApplicationScoped;


@Readiness
@ApplicationScoped
public class Health implements HealthCheck {

	private static final Logger log = LoggerFactory.getLogger(Health.class);

	@Override
    public HealthCheckResponse call() {
        log.info("Calling HealthCheckResponse");
        return HealthCheckResponse.up("coffee-shop");

    }

}
