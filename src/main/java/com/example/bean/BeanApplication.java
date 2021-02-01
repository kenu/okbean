package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanApplication implements CommandLineRunner {

	@Autowired
	MemberKenu kenu;

	@Autowired
	MemberD36choi memberD36choi;

	public static void main(String[] args) {
		SpringApplication.run(BeanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		kenu.displayInfo();
		// add line
		memberD36choi.displayInfo();
	}
}
