package com.example.securitymasterdemo.dao;

import com.example.securitymasterdemo.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentDao extends CrudRepository<Department,Integer> {
}
