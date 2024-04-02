package com.takarub.transaction.service;

import com.takarub.transaction.Repository.EmployeeRepository;
import com.takarub.transaction.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    public void save(Employee employee){
        repository.save(employee);
    }
}
