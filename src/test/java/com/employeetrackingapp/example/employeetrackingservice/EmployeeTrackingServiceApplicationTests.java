package com.employeetrackingapp.example.employeetrackingservice;

import com.employeetrackingapp.example.employeetrackingservice.models.Employee;
import com.employeetrackingapp.example.employeetrackingservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest
class EmployeeTrackingServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Employee matt = new Employee("Matt Smith", 40, "3725HFDRWHOFH", "thedoctor@tardis.universe");
		employeeRepository.save(matt);
	}



}
