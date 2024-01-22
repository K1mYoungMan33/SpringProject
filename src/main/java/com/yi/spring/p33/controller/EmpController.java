package com.yi.spring.p33.controller;

import com.yi.spring.p33.mappers.EmployeeMapper;
import com.yi.spring.p33.service.EmployeeService;
import com.yi.spring.p33.vo.Employee;
import com.yi.spring.p33.vo.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@ComponentScan
@RequestMapping("/p33/emp/*")
public class EmpController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    EmployeeMapper employeeMapper;
    @GetMapping("emplist")
    public String empList(EmployeeVO vo, Model model ) throws Exception {
        List<Employee> employeeList = employeeService.listEmployees();

        System.out.println( employeeList );

        model.addAttribute( "list", employeeList );

        return "/emp/emp_list";
    }
    @GetMapping("emplist2")
    public String empList2(EmployeeVO vo, Model model ) throws Exception {
        List<Employee> employeeList = employeeMapper.listEmployees();

        System.out.println( employeeList );

        return "/emp/emp_list";
    }
}
