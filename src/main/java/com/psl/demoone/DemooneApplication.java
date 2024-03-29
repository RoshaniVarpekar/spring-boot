package com.psl.demoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages= {"com"})
@EnableSwagger2
public class DemooneApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemooneApplication.class, args);
	}
}
