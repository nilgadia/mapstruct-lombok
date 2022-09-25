package org.shahid.repo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.shahid.repo.AddToRepo;
import org.shahid.repo.StandardMapper;
import org.shahid.repo.domain.Car;
import org.shahid.repo.domain.CarDto;

@AddToRepo
@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CarMapper extends StandardMapper<Car, CarDto> {

	@Mapping(source = "numberOfSeats", target = "seatCount")
	CarDto map(Car Car);
}