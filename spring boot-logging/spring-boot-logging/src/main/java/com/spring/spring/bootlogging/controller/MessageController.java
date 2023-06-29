package com.spring.spring.bootlogging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
  Logger logger =  LoggerFactory.getLogger(MessageController.class);
    @GetMapping("/message")
    public String getMessage(){
        logger.info("[get message] info message");
        logger.warn("[get message] warn message ");
        logger.error("[get message] error message");
        logger.debug("[get message] debug message");
        logger.trace("[get message] trace message");
        System.out.println(10/0);
        return"hello";

    }
}
