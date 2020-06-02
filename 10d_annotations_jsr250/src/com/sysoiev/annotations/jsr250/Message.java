package com.sysoiev.annotations.jsr250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {
    private String message;

    public String getMessage() {
        return "Message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void initBean() {
        System.out.println("Bean is passing init stage.");
    }

    @PreDestroy
    public void destroyBean() {
        System.out.println("Bean is passing destroy stage.");
    }
}
