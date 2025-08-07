package org.demo.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity(prePostEnabled = true)
public class SampleApplication {

  public static void main(String[] args) {
    String perpexlityKey = "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";
    SpringApplication.run(SampleApplication.class, args);
  }

}
