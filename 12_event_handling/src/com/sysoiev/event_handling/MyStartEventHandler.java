package com.sysoiev.event_handling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

class MyStartEventHandler implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("We've received ContextStartedEvent...");
    }
}
