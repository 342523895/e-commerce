package com.commerce.eohno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.commerce.eohno.mapper")
public class EohnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EohnoApplication.class, args);
	}

}
