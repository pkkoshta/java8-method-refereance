package com.prashant.dao;


import com.prashant.dto.EmployeeDTO;
import com.prashant.entity.Employee;

public class Mapper {

    public EmployeeDTO mapToDto(Employee employee){
        // List<EmployeeDTO> employeeDTOS = new ArrayList<>();
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName(employee.getName());
        employeeDTO.setAge(employee.getAge());
        employeeDTO.setId(employee.getId());
        //employeeDTOS.add(employeeDTO);
        return employeeDTO;
    }

}
