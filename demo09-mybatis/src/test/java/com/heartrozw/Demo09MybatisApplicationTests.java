package com.heartrozw;

import com.heartrozw.dao.CityDAO;
import com.heartrozw.dao.service.CityService;
import com.heartrozw.entity.City;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo09MybatisApplicationTests {

	@Autowired
	private CityDAO cityDao;

	@Test
	public void test1() {
		List<com.heartrozw.entity.City> list = cityDao.selectAll();
		list.forEach(System.out::println);
	}

	@Autowired
	private CityService cityService;

	@Test
	public void test2() {
		City c1 = new City(1L, "aaa", "a", "aaa", 0);
		cityService.add(c1);
	}

	@Test
	void contextLoads() {
	}

}
