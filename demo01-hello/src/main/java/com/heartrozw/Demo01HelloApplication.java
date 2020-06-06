package com.heartrozw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//这个注解表示这是一个springboot应用程序
@SpringBootApplication
public class Demo01HelloApplication {
//应用程序的启动方法
	public static void main(String[] args) {
		SpringApplication.run(Demo01HelloApplication.class, args);

		//1、HelloController，测试一个简单的控制器
		//2、banner.txt，修改springboot默认的启动banner
	}

}
