package com.gg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gg.mapper") //扫描的mapper
public class SpringbootMybatis01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatis01Application.class, args);
	}
}
