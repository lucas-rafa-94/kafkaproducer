package com.example.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Run implements CommandLineRunner {
   @Autowired Sender sender;
    @Override
    public void run(String...args) throws Exception {
        sender.send("test", "teste");
    }
}