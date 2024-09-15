package com.springboottutorial.springbootwebtutorial.controllers;

import com.springboottutorial.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){
        return new EmployeeDTO(employeeId,"ankush","hello@gmail",80, LocalDate.of(2013,1,1),true);
    }

    @GetMapping("/employees")
    public String getAllEmployees(@RequestParam Integer age)
    {
        return "Hi age is "+age;
    }

    @PutMapping("/employees")
    public String createNewEmployee()
    {
        return "new Employee created";
    }

    @PostMapping("/employees")
    public EmployeeDTO updateEmployeeById(@RequestBody EmployeeDTO emplo)
    {
        emplo.setId(54L);
        return emplo;

    }
}
