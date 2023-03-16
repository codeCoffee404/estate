package com.heima.estatemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
/*
* @MapperScan要导入tk包的
* */
@MapperScan(basePackages = "com.heima.estatemanagement.dao")
public class EstateManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(EstateManagementApplication.class, args);
		System.out.println("  _                        \n" +
				" | |                       \n" +
				" | |   ___   __   __   ___ \n" +
				" | |  / _ \\  \\ \\ / /  / _ \\\n" +
				" | | | (_) |  \\ V /  |  __/\n" +
				" |_|  \\___/    \\_/    \\___|\n" +
				"                           \n" +
				"                           ");
	}

}
