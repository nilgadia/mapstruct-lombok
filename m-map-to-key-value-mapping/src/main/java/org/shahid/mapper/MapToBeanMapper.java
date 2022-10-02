package org.shahid.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.Department;
import org.shahid.dto.Employee;

import java.util.Map;

@Mapper
public interface MapToBeanMapper {

    MapToBeanMapper INSTANCE = Mappers.getMapper(MapToBeanMapper.class);

    @Mapping(target = "department", ignore = true)
    Employee fromMap(Map<String, String> map);

    @AfterMapping
    default void finishEmployee(@MappingTarget Employee employee, Map<String, String> map) {
        employee.setDepartment(fromMapToDepartment(map));
    }

    @Mapping(target = "id", source = "did")
    @Mapping(target = "name", source = "dname")
    Department fromMapToDepartment(Map<String, String> map);
}
