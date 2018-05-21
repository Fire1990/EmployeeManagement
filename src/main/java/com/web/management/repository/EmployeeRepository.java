package com.web.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.management.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
