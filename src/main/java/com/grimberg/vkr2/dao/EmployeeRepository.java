package com.grimberg.vkr2.dao;

import com.grimberg.vkr2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByLastNameAsc();

    public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lastName);
}
