package com.yi.spring.service;

import com.yi.spring.mappers.EmployeeMapper;
import com.yi.spring.vo.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public List<Employee> listEmployees() {
        return employeeMapper.listEmployees();
    }
}
