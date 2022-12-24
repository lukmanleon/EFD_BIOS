package com.emilfreydigital.bios.company.service;

import com.emilfreydigital.bios.company.converter.EmployeeConverter;
import com.emilfreydigital.bios.company.dto.EmployeeDetailsDto;
import com.emilfreydigital.bios.company.dto.EmployeeDto;
import com.emilfreydigital.bios.company.model.Employee;
import com.emilfreydigital.bios.company.repository.EmployeeRepository;
import com.emilfreydigital.bios.exception.ApiRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    private final EmployeeRepository employeeRepository;
    private final EmployeeConverter employeeConverter;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository, EmployeeConverter employeeConverter) {
        this.employeeRepository = employeeRepository;
        this.employeeConverter = employeeConverter;
    }

    public List<EmployeeDto> getAll() {
        try {
            logger.info("EMPLOYEE: Fetching all employees from database.");
            List<Employee> allEmployees = employeeRepository.findAll();

            logger.info("EMPLOYEE: Processing employee data.");
            List<EmployeeDto> employeeDtoList = null;
            if (!(allEmployees == null) && !(allEmployees.isEmpty())) {
                EmployeeDto temporaryDto = null;
                for (Employee e : allEmployees) {
                    temporaryDto = employeeConverter.convertFromEntity(e);
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
            logger.info("EMPLOYEE: Returning list of employees.");
            return employeeDtoList;

        } catch (Exception e) {
            logger.info("EMPLOYEE - ERROR - Something went wrong while fetching the list of employees. " + e.getStackTrace());
            throw new ApiRequestException("An error occurred while getting the list of companies.",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    public List<EmployeeDetailsDto> getAllForTable() {
        try {
            logger.info("EMPLOYEE: Fetching all employees from database.");
            List<Employee> allEmployees = employeeRepository.findAll();

            logger.info("EMPLOYEE: Processing employee data.");
            List<EmployeeDetailsDto> employeeDtoList = null;
            if (!(allEmployees == null) && !(allEmployees.isEmpty())) {
                EmployeeDetailsDto temporaryDto = null;
                for (Employee e : allEmployees) {
                    temporaryDto = employeeConverter.convertToDetailedDto(e);
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
            logger.info("EMPLOYEE: Returning list of employees for the table view. ");
            return employeeDtoList;

        } catch (Exception e) {
            logger.info("EMPLOYEE - ERROR - Something went wrong while fetching the list of employees for the table view. " + e.getStackTrace());
            throw new ApiRequestException("An error occurred while getting the list of companies.",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    public EmployeeDetailsDto getEmployeeById(Long id) {
        Optional<Employee> searchedEmployee = employeeRepository.findById(id);
        if (!searchedEmployee.isPresent()) {
            logger.info("EMPLOYEE - ERROR - Something went wrong while fetching the list of employees. ");
            throw new ApiRequestException("The employee with the ID: " + id.toString() + " was not found. ",
                    HttpStatus.NOT_FOUND);
        }
        logger.info("EMPLOYEE: Returning data for employee with ID: " + id.toString() + ". ");
        return employeeConverter.convertToDetailedDto(searchedEmployee.get());
    }


}
