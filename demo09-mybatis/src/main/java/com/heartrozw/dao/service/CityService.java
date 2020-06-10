package com.heartrozw.dao.service;

import com.heartrozw.dao.CityDAO;
import com.heartrozw.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional
public class CityService {
    @Transactional
    //@Transactional(readOnly = true)
    public int add(City city) {
        int row = cityDAO.insert(city);
        //int row2 = cityDAO.insert(city);
        //if (1==1) throw new RuntimeException("测试异常回滚不");
        return row;
    }

    @Autowired
    private CityDAO cityDAO;
}
