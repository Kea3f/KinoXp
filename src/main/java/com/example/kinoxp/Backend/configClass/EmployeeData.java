package com.example.kinoxp.Backend.configClass;

import com.example.kinoxp.Backend.model.Employee;
import com.example.kinoxp.Backend.repositories.EmployeeRepository;
import com.example.kinoxp.Backend.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeData implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;
    MovieRepository movieRepository;

    @Override
    public void run(String... args) throws Exception {

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setPassword("Kea1234.");
        employee1.setEmployee_name("Naja M.");
        employee1.setEmployee_mail("najamoe@outlook.dk");
        employee1.setEmployee_phoneNo(62622362);

        // Save the employee to the database using the repository
        employeeRepository.save(employee1);


        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setPassword("Kea1234.");
        employee2.setEmployee_name("Sabrina E.");
        employee2.setEmployee_mail("Sabrina.ebbesen@gmail.com");
        employee2.setEmployee_phoneNo(27710977);

        // Save the employee to the database using the repository
        employeeRepository.save(employee2);


        Employee employee3 = new Employee();
        employee3.setId(3);
        employee3.setPassword("Kea1234.");
        employee3.setEmployee_name("Heval P.");
        employee3.setEmployee_mail("HevalP@outlook.dk");
        employee3.setEmployee_phoneNo(23263981);

        // Save the employee to the database using the repository
        employeeRepository.save(employee3);


        Employee employee4 = new Employee();
        employee4.setId(4);
        employee4.setPassword("Kea1234.");
        employee4.setEmployee_name("Mathilde T.");
        employee4.setEmployee_mail("Trendy@gmail.com");
        employee4.setEmployee_phoneNo(25263840);

        // Save the employee to the database using the repository
        employeeRepository.save(employee4);

    }

}