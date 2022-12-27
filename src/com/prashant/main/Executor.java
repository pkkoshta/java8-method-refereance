package com.prashant.main;

import com.prashant.dao.EmployeeDao;
import com.prashant.dao.Mapper;
import com.prashant.dto.EmployeeDTO;
import com.prashant.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Executor {
    public static void main(String[] args) {


//        using System.out::println method for static method
       EmployeeDao.getEmployees().forEach(System.out::println);
   EmployeeDao employeeDao = new EmployeeDao();
   
//   for instance method
        List<String> names = EmployeeDao.getEmployees()
                .stream()
                .map(Employee::getName)// whenever we call a instance method from object it if method does't
                                        // have paramether than it consider as static method
                .collect(Collectors.toList());
        System.out.println("names = " + names);

//
       /* List<EmployeeDTO> employeeDTOS = EmployeeDao.getEmployees()
                .stream()
                .map(Executor::mapToDto)
                .collect(Collectors.toList());
        System.out.println("employeeDTOS = " + employeeDTOS);*/

        Mapper mapper = new Mapper();

        List<EmployeeDTO> employeeDTOS = EmployeeDao.getEmployees()
                .stream()
                .map(mapper::mapToDto)
                .collect(Collectors.toList());
        System.out.println("employeeDTOS = " + employeeDTOS);

    }

}
