package com.example.bean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanApplication implements CommandLineRunner {

    private final MemberKenu kenu;
    private final MemberGyumin gyumin;

    public BeanApplication(final MemberKenu kenu, final MemberGyumin gyumin) {
        this.kenu = kenu;
        this.gyumin = gyumin;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeanApplication.class, args);
    }

    @Override
    public void run(String... args) {
        kenu.displayInfo();
        gyumin.displayInfo();
    }
}
