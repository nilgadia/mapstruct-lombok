package org.shahid.repo.mappers;

import javax.annotation.processing.Generated;
import org.shahid.repo.domain.Car;
import org.shahid.repo.domain.CarDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-25T13:48:43+0300",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDto update(Car arg0, CarDto arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        if ( arg0.getMake() != null ) {
            arg1.setMake( arg0.getMake() );
        }
        if ( arg0.getType() != null ) {
            arg1.setType( arg0.getType().name() );
        }

        return arg1;
    }

    @Override
    public CarDto map(Car Car) {
        if ( Car == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setSeatCount( Car.getNumberOfSeats() );
        carDto.setMake( Car.getMake() );
        if ( Car.getType() != null ) {
            carDto.setType( Car.getType().name() );
        }

        return carDto;
    }
}
