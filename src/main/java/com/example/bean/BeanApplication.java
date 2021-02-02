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
	MemberBobae bobae;
	@Autowired
	MemberCovenant covenant;
	@Autowired 
  MemberMarc marc;
	@Autowired 
 	MemberQuadam36 quadam36;
	@Autowired
	MemberD36choi memberD36choi;
	@Autowired
	MemberSeokkie seokkie;
	@Autowired
	MemberDaeun jeongdaeun98;

	public static void main(String[] args) {
		SpringApplication.run(BeanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		kenu.displayInfo();
		covenant.displayInfo();
		// add line
		bobae.displayInfo();
		marc.displayInfo();
		quadam36.displayInfo();
		memberD36choi.displayInfo();
		seokkie.displayInfo();
		jeongdaeun98.displayInfo();
	}
}
