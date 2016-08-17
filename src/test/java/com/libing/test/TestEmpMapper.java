/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.libing.bean.Emp;
import com.libing.dao.EmpMapper;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月28日下午10:56:38
 */
public class TestEmpMapper {

    @Test
    public void testFindAll() {
        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        EmpMapper empMapper = ac.getBean("empMapper", EmpMapper.class);
        List<Emp> list = empMapper.findAll();
        for (Emp emp : list) {
            System.out.println(emp.toString());
        }
        AbstractApplicationContext aac = (AbstractApplicationContext) ac;
        aac.close();
    }

}

