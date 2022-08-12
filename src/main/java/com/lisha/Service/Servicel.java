package com.lisha.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lisha.model.Employee;


@Service
public interface Servicel {
public Employee AddEployee(Employee employee);
public List<Employee> getAllEmployee(Employee employee);

}
