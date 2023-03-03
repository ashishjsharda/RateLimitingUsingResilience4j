package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RateLimiterConfig {

    @Bean
    public RateLimiterConfig rateLimiterConfig() {
        return new RateLimiterConfig().custom()
    }
}
