package com.example.app;

import com.example.app.config.GreetingConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(GreetingConfiguration.class)
@SpringBootApplication
public class Step4App {

  public static void main(String[] args) {
    SpringApplication.run(Step4App.class, args);
  }
}
