package com.heartrozw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo04StaticResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo04StaticResourceApplication.class, args);

//		此项目中的4个index{数字}.html文件改为index.html，可以观察默认静态资源加载顺序
	}

}
