package com.tcs.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaApplication.class, args);
		
		EmployeeRepository bean = run.getBean(EmployeeRepository.class);
		
		Employee e = new Employee();
		
		e.setId(1);
		e.setName("Gowtham");
		e.setSalary(6000);
		
		bean.save(e);
		
		System.out.println("Data Saved Successfully");
	}

	
}
