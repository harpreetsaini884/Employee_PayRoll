    package com.bridgelabz.EmployeePayrollApp.service;



    import com.bridgelabz.EmployeePayrollApp.EmployeePayrollData;
    import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
    import com.bridgelabz.EmployeePayrollApp.repository.EmployeePayrollRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public class EmployeePayrollService implements IEmployeePayrollService {

        @Autowired
        private EmployeePayrollRepository repository;

        @Override
        public List<EmployeePayrollData> getAllEmployees() {
            return repository.findAll();
        }

        @Override
        public EmployeePayrollData getEmployeeId(int id) {
            return null;
        }

        @Override
        public EmployeePayrollData getEmployeeById(int id) {
            return repository.findById(id).orElse(null);
        }

        @Override
        public EmployeePayrollData createEmployee(EmployeePayrollDTO dto) {
            EmployeePayrollData data = new EmployeePayrollData(0, dto.getName(), dto.getDepartment(), dto.getSalary());
            return repository.save(data);
        }

        @Override
        public EmployeePayrollData updateEmployee(int id, EmployeePayrollDTO dto) {
            EmployeePayrollData existing = repository.findById(id).orElse(null);
            if (existing != null) {
                existing.setName(dto.getName());
                existing.setDepartment(dto.getDepartment());
                existing.setSalary(dto.getSalary());
                return repository.save(existing);
            }
            return null;
        }

        @Override
        public void deleteEmployee(int id) {
            repository.deleteById(id);
        }
    }

