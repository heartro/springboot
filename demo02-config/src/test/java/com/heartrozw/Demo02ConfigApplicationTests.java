package com.heartrozw;

import com.heartrozw.entity.Book;
import com.heartrozw.entity.Goods;
import com.heartrozw.entity.Role;
import com.heartrozw.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo02ConfigApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private User user;

	@Test
	void test1() {
		System.out.println(user);
	}

	@Autowired
	private Role role;

	@Test
	void test2() {
		System.out.println(role);
	}

	@Autowired
	private Book book;

	@Test
	void test3() {
		System.out.println(book);
	}

	@Autowired
	private Goods goods;

	@Test
	void test4() {
		System.out.println(goods);
	}
}
