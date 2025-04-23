package com.bridgelabz.EmployeePayrollApp.repository;

import com.bridgelabz.EmployeePayrollApp.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData,Integer> {

}
