package com.prashant.dao;

import com.prashant.entity.Employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeDao {

    public static List<Employee> getEmployees(){
        return IntStream
                .range(1,10)
                .mapToObj(e-> new Employee(e, "Employee"+e, e*20))
                .collect(Collectors.toList());
    }
}
