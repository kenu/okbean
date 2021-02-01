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
	MemberSeokkie seokkie;

	public static void main(String[] args) {
		SpringApplication.run(BeanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		kenu.displayInfo();
		seokkie.displayInfo();
	}
}
