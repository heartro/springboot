package com.heartrozw.demo08jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Demo08JdbcApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Test
	public void test1() throws SQLException {
		System.out.println("数据源：" + dataSource);

		Connection conn = dataSource.getConnection();
		System.out.println("连接：" + conn);

		conn.close();
	}

	@Autowired
	private JdbcTemplate template;

	@Test
	public void test2() {
		List<Map<String, Object>> list = template.queryForList("select * from T_ServiceItem");
		list.forEach(System.out::println);
	}

	@Test
	void contextLoads() {
	}

}
