package com.bridgelabz.EmployeePayrollApp.service;

import com.bridgelabz.EmployeePayrollApp.EmployeePayrollData;
import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getAllEmployees();
    EmployeePayrollData getEmployeeId(int id);

    EmployeePayrollData getEmployeeById(int id);

    EmployeePayrollData createEmployee(EmployeePayrollDTO employeeDTO);
    EmployeePayrollData updateEmployee(int id, EmployeePayrollDTO employeeDTO);
    void deleteEmployee(int data);
}
