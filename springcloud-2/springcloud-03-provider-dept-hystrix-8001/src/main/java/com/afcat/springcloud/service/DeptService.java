package com.afcat.springcloud.service;

import com.afcat.springcloud.entity.Dept;

import java.util.List;

/**
 * Created by yangxu on 2018/8/10.
 */
public interface DeptService {

    public boolean  add(Dept dept);

    public Dept get(long id);


    public List<Dept> list();

}
