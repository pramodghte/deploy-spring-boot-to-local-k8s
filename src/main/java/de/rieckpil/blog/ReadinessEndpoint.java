package de.rieckpil.blog;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "readiness")
public class ReadinessEndpoint {

    @ReadOperation
    public String getReadiness() {
        // do a custom check for readiness
        if (true) {
               return "hello";
        } else {
            throw new RuntimeException("Not ready");
        }
    }
}