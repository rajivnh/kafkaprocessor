package com.stream;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@SpringBootApplication
public class ProcessorApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProcessorApplication.class, args);
	}
    
    @Bean
    public Function<Flux<String>, Flux<String>> msg() {
        return (msg) -> {
        	return msg.map(String::toUpperCase);
        };
    }
}
