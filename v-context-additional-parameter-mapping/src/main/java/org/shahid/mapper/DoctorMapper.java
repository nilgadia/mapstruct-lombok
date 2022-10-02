package org.shahid.mapper;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.shahid.dto.DoctorDto;
import org.shahid.model.City;
import org.shahid.model.Doctor;

import java.util.List;

@Mapper
public interface DoctorMapper {

    @Mapping(source = "cityId",
            target = "cityName",
            qualifiedByName = "cityName")
    DoctorDto toDto(Doctor doctor, @Context List<City> cities);

    @Named("cityName")
    default String getCityName(int cityId, @Context List<City> cities) {
        return cities.stream()
                .filter(city -> city.getId() == cityId)
                .findAny()
                .map(City::getName)
                .orElse(null);
    }
}
