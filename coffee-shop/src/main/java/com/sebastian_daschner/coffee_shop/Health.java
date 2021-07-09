package com.sebastian_daschner.coffee_shop;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;


import javax.enterprise.context.ApplicationScoped;
//import io.quarkus.logging.json.runtime.LoggingJsonRecorder;
//import java.util.logging.Logger;
import java.util.logging.Level;


@Readiness
@ApplicationScoped
public class Health implements HealthCheck {

	//LoggingJsonRecorder log = LoggingJsonRecorder.class.
	// private static final Logger log = LoggerFactory.getLogger(HealthCheck.class);

  private static final Logger logger = Logger.getLogger(Health.class.getName());


	@Override
    public HealthCheckResponse call() {
        logger.log(Level.INFO, "Test log of structured arg");
        return HealthCheckResponse.up("coffee-shop");

    }

}
