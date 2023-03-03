package controller;

import io.github.resilience4j.ratelimiter.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private final RateLimiter rateLimiter;

    public MyController(RateLimiter rateLimiter) {
        this.rateLimiter = rateLimiter;
    }

    @GetMapping("/test")
    public String test() {
        return rateLimiter.executeSupplier(() -> "Hello World");
    }

}
