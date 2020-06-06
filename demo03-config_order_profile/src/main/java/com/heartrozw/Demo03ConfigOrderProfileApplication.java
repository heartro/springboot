package com.heartrozw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo03ConfigOrderProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo03ConfigOrderProfileApplication.class, args);
	}

}

//	Config locations are searched in reverse order. By default,
//		the configured locations are
//			classpath:/,
//			classpath:/config/,
//			file:./,
//			file:./config/*/,
//			file:./config/.

//	The resulting search order is the following:
//		file:./config/
//
//		file:./config/*/
//
//		file:./
//
//		classpath:/config/
//
//		classpath:/