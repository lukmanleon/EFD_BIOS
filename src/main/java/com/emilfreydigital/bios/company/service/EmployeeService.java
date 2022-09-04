package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.converter.EmployeeConverter;
import com.emilfreydigital.bios.company.dto.EmployeeDetailsDto;
import com.emilfreydigital.bios.company.dto.EmployeeDto;
import com.emilfreydigital.bios.company.model.Employee;
import com.emilfreydigital.bios.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeDto> getAll() {
        List<Employee> allEmployees = employeeRepository.findAll();
        List<EmployeeDto> employeeDtoList = null;

        if (!(allEmployees == null) && !(allEmployees.isEmpty())) {
            EmployeeDto temporaryDto = null;
            for (Employee e : allEmployees) {
                temporaryDto = EmployeeConverter.toDto(e);
                if (employeeDtoList != null) {
                    if (!employeeDtoList.contains(temporaryDto)) {
                        employeeDtoList.add(temporaryDto);
                    }
                } else {
                    employeeDtoList = new ArrayList<>();
                    employeeDtoList.add(temporaryDto);
                }
            }
        }
        return employeeDtoList;
    }

    public EmployeeDetailsDto getEmployeeById(Long Id) {
        Optional<Employee> searchedEmployee = employeeRepository.findById(Id);
        if (!searchedEmployee.isPresent()) {
            throw new EntityNotFoundException();
        }
        return EmployeeConverter.toDetailedDto(searchedEmployee.get());
    }


}