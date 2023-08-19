package com.example.thymeleaf.service;


import com.example.thymeleaf.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

        List<Employee> getAllEmployees();

        void saveEmployee(Employee employee);

        Employee getEmployeeById(Long id);

        void deleteEmployeeById(Long id);

        Page<Employee> findPaginated(int pageNo, int pageSize);


}
