package com.example.kinoxp.Backend.repositories;

import com.example.kinoxp.Backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
Employee findAllById(int id);

}


