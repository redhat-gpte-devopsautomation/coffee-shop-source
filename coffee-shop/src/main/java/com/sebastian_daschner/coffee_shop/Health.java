package com.sebastian_daschner.coffee_shop;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.enterprise.context.ApplicationScoped;
import io.quarkus.logging.json.runtime.LoggingJsonRecorder;



@Readiness
@ApplicationScoped
public class Health implements HealthCheck {

	//LoggingJsonRecorder log = LoggingJsonRecorder.class.
	private static final Logger log = LoggerFactory.getLogger(HealthCheck.class);
    
	@Override
    public HealthCheckResponse call() {
        log.info("Test log of structured arg");
        return HealthCheckResponse.up("coffee-shop");

    }

}
