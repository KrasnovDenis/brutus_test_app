package com.krasnov.counter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MetricsController {

    @GetMapping("/metrics")
    public ResponseEntity<?> sendMetrics() {
        return ResponseEntity.ok(new HashMap<>() {{
            put("Available processors", Runtime.getRuntime().availableProcessors());
            put("Available memory", Runtime.getRuntime().freeMemory());
            put("Total memory", Runtime.getRuntime().totalMemory());
            put("Max memory", Runtime.getRuntime().maxMemory());
        }});
    }
}
