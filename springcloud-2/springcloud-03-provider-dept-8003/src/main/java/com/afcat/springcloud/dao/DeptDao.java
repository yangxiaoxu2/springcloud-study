package com.afcat.springcloud.dao;

import com.afcat.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by yangxu on 2018/8/10.
 */
@Mapper
public interface DeptDao {

    public boolean  addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
