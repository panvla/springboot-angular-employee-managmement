package com.vladimirpandurov.springbootemployeeemanagement.repository;

import com.vladimirpandurov.springbootemployeeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
