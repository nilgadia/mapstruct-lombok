package org.shahid.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.shahid.dto.EmployeeDto;
import org.shahid.model.Employee;

import java.util.UUID;

@Mapper
public interface EmployeeMapper {
    //@Mapping(target = "uid", defaultExpression = "java(UUID.randomUUID().toString())")
    @Mapping(target = "uid", expression = "java(generateUidNumber())")
    @Mapping(target = "prefixNumber", constant = "1000")
    Employee toModel(EmployeeDto dto);

    default String generateUidNumber() {
        return UUID.randomUUID().toString();
    }

    @Mapping(source = "dateOfBirth", target = "dateOfBirth", dateFormat = "dd-MM-yyyy HH:mm:ss")
    @Mapping(source = "salary", target = "salary", numberFormat = "$#.00")
    @Mapping(target = "dutyHours", defaultValue = "8")
    EmployeeDto toDto(Employee model);
}
