package com.bridgelabz.EmployeePayrollApp.controller;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeePayrollApp.EmployeePayrollData;
import com.bridgelabz.EmployeePayrollApp.service.IEmployeePayrollService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    private IEmployeePayrollService service;

    // GET all employees
    @GetMapping
    public List<EmployeePayrollData> getAllEmployees() {
        return service.getAllEmployees();
    }

    // GET employee by ID
    @GetMapping("/{id}")
    public EmployeePayrollData getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    // CREATE employee (new user)
    @PostMapping
    public EmployeePayrollData createEmployee(@Valid @RequestBody EmployeePayrollDTO dto) {
        return service.createEmployee(dto);
    }

    // UPDATE employee
    @PutMapping("/{id}")
    public EmployeePayrollData updateEmployee(@PathVariable int id, @Valid @RequestBody EmployeePayrollDTO dto) {
        return service.updateEmployee(id, dto);
    }

    // DELETE employee
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
    }
}

//package com.bridgelabz.EmployeePayrollApp.controller;
//
//
//
//import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
//import com.bridgelabz.EmployeePayrollApp.EmployeePayrollData;
//import com.bridgelabz.EmployeePayrollApp.service.IEmployeePayrollService;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/employee")
//@CrossOrigin("*")
//public class EmployeePayrollController {
//
//    @Autowired
//    private IEmployeePayrollService service;
//
//    @GetMapping
//    public List<EmployeePayrollData> getAllEmployees() {
//        return service.getAllEmployees();
//    }
//
//    @GetMapping("/{id}")
//    public EmployeePayrollData getEmployeeById(@PathVariable int id) {
//        return service.getEmployeeById(id);
//    }
//
//    @PostMapping
//    public EmployeePayrollData createEmployee(@Valid @RequestBody EmployeePayrollDTO dto) {
//        return service.createEmployee(dto);
//    }
//
//    @PutMapping("/{id}")
//    public EmployeePayrollData updateEmployee(@PathVariable int id, @Valid @RequestBody EmployeePayrollDTO dto) {
//        return service.updateEmployee(id, dto);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteEmployee(@PathVariable int id) {
//        service.deleteEmployee(id);
//    }
//}
//
