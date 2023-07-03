package com.employeetrackingapp.example.employeetrackingservice.repositories;
import com.employeetrackingapp.example.employeetrackingservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
