package com.example.springboothysterix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author jalajchawla
 */
@SpringBootApplication
@EnableHystrix
public class SpringBootHysterixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHysterixApplication.class, args);
    }

}
