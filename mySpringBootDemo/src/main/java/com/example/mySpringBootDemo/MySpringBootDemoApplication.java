package com.example.mySpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ServletComponentScan
@EnableAutoConfiguration
public class MySpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootDemoApplication.class, args);
	}
}
