package com.heartrozw.dao;

import com.heartrozw.entity.City;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityDAO {
    List<City> selectAll();
    int insert(@Param("city") City city);
}
