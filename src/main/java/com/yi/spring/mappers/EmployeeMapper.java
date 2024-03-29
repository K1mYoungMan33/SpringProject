package com.yi.spring.mappers;

import com.yi.spring.vo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> listEmployees();
}
