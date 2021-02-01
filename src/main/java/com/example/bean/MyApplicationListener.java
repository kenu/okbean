package com.example.bean;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<ApplicationReadyEvent> {
    private final MemberKenu kenu;
    private final MemberGyumin gyumin;

    public MyApplicationListener(final MemberKenu kenu, final MemberGyumin gyumin) {
        this.kenu = kenu;
        this.gyumin = gyumin;
    }

    @Override
    public void onApplicationEvent(final ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("2. ApplicationReadyEvent is fired!");
        kenu.displayInfo();
        gyumin.displayInfo();
    }
}
