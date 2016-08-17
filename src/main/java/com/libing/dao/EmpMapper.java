/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.dao;

import java.util.List;

import com.libing.annotation.MybatisRepository;
import com.libing.bean.Emp;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月28日下午10:43:26
 */
@MybatisRepository
public interface EmpMapper {

    public List<Emp> findAll();

}

