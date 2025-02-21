package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;


    private final CounterService counterService;

    public Controller(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping("/increment")
    public int increment() {
        return counterService.increment();
    }

    @PostMapping("/long-running-task")
    public String longRunningTask() {
        try {
            counterService.longRunningTask();
            return "Operazione completata.";
        } catch (InterruptedException e) {
            return "Operazione interrotta.";
        }
    }


}
