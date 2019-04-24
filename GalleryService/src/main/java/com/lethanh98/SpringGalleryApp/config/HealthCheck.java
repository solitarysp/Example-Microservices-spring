package com.lethanh98.SpringGalleryApp.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

// @Component
// cusotm health check
public class HealthCheck implements HealthIndicator {

    @Override
    public Health health() {
        int errorCode = check(); // perform some specific health check
        if (errorCode != 0) {
            return Health.down()
                    .withDetail("Error Code", errorCode).build();
        }
        System.out.println("d");
        return Health.up().build();
    }

    public int check() {
        // Our logic to check health
        return 0;
    }
}

