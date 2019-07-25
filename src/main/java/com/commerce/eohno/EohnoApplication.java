package com.commerce.eohno;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.commerce.eohno.modules.*.dao")
public class EohnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EohnoApplication.class, args);
	}

}
