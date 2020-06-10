package com.heartrozw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.heartrozw.dao")	//扫描DAO接口的包
@EnableTransactionManagement		//启用事务管理器
public class Demo09MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo09MybatisApplication.class, args);
	}

}
