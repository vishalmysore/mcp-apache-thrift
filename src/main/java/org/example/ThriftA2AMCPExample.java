package org.example;

import io.github.vishalmysore.tools4ai.EnableAgent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAgent
public class ThriftA2AMCPExample {
    public static void main(String[] args) {
        SpringApplication.run(ThriftA2AMCPExample.class, args);
    }
}
