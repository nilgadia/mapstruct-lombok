package org.shahid.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.shahid.dto.CarDTO;
import org.shahid.dto.FuelType;
import org.shahid.model.BioDieselCar;
import org.shahid.model.Car;
import org.shahid.model.ElectricCar;

@Mapper
public interface CarsMapper {
    @BeforeMapping
    default void enrichDTOWithFuelType(Car car, @MappingTarget CarDTO carDto) {
        if (car instanceof ElectricCar) {
            carDto.setFuelType(FuelType.ELECTRIC);
        }
        if (car instanceof BioDieselCar) {
            carDto.setFuelType(FuelType.BIO_DIESEL);
        }
    }

    @AfterMapping
    default void convertNameToUpperCase(@MappingTarget CarDTO carDto) {
        carDto.setName(carDto.getName().toUpperCase());
    }

    CarDTO toCarDto(Car car);
}