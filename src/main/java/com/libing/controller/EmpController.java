/*
 * Copyright (c) 2016 Sohu TV. All rights reserved.
 */
package com.libing.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libing.bean.Emp;
import com.libing.dao.EmpMapper;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2016年3月29日上午9:12:13
 */
@Controller
@RequestMapping("emp")
public class EmpController {

    @Resource
    private EmpMapper empMapper;

    public EmpMapper getEmpMapper() {
        return empMapper;
    }

    public void setEmpMapper(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }

    @RequestMapping("list")
    public String execute(Model model) {
        List<Emp> list = empMapper.findAll();
        model.addAttribute("emps", list);
        return "emp_list";
    }

}
