package org.faubertin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }

}
