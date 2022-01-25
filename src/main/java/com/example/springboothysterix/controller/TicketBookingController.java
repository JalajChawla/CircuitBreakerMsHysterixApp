package com.example.springboothysterix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author jalajchawla
 */
@RestController
@RequestMapping("/ticket")
public class TicketBookingController {
    @GetMapping("book")
    @HystrixCommand(fallbackMethod = "dummyBookTicket")
    public String bookTicket(){
        if(new Random().nextInt(10)<5){
            throw new RuntimeException("Problem in b logic");
        }
        return "output from b logic";
    }

    public String dummyBookTicket(){
        return "Please try again later - Inconvenience is regretted";
    }
}
