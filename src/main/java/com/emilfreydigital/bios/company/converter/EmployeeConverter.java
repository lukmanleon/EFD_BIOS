package com.emilfreydigital.bios.company.converter;


import com.emilfreydigital.bios.Converter;
import com.emilfreydigital.bios.company.dto.EmployeeDetailsDto;
import com.emilfreydigital.bios.company.dto.EmployeeDto;
import com.emilfreydigital.bios.company.model.Employee;
import org.springframework.stereotype.Component;

@Component
public final class EmployeeConverter extends Converter<EmployeeDto, Employee> {

    public EmployeeConverter() {
        super(EmployeeConverter::convertToEntity, EmployeeConverter::convertToDto);
    }

    private static EmployeeDto convertToDto(Employee model) {
        return new EmployeeDto(model.getId(), model.getName(), model.getSurname(), model.getImageUrl(),
                model.getExternal(), model.getJobTitleId(), model.getCompanyId());
    }

    public EmployeeDetailsDto convertToDetailedDto(Employee model) {
        return new EmployeeDetailsDto(model.getId(), model.getName(), model.getSurname(), model.getBirthday(), model.getGender(),
                model.getEmail(), model.getPhone(), model.getImageUrl(), model.getExternal(), model.getJobTitleId(), model.getOfficeRoomID(), model.getCompanyId());
    }

    private static Employee convertToEntity(EmployeeDto dto) {
        return new Employee(dto.getId(), dto.getName(), dto.getSurname(), null, null,
                null, null, dto.getImageUrl(),
                dto.getExternal(), dto.getJobTitleId(), null, dto.getCompanyId(), null, null);
    }

}
