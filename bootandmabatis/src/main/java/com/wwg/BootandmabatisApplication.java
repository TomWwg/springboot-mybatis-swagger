package com.wwg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wwg
 */
@ComponentScan(basePackages ="com.wwg")
@SpringBootApplication
public class BootandmabatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootandmabatisApplication.class, args);
	}
}
