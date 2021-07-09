package com.sebastian_daschner.coffee_shop;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import java.util.logging.Level;

import javax.enterprise.context.ApplicationScoped;


@Readiness
@ApplicationScoped
public class Health implements HealthCheck {

	// private static final Logger log = LoggerFactory.getLogger(Health.class);
  private static final java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

	@Override
    public HealthCheckResponse call() {
        logger.log("Calling HealthCheckResponse");
        return HealthCheckResponse.up("coffee-shop");

    }

}
