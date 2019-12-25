package com.gg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.gg.controller"})
public class SpringBoot01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01Application.class, args);
		System.out.print("init app");
	}

}
