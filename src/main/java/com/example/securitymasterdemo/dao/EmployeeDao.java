package com.example.securitymasterdemo.dao;

import com.example.securitymasterdemo.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
