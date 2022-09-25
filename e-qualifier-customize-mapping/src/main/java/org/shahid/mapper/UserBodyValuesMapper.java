package org.shahid.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.shahid.annotation.PoundToKilogram;
import org.shahid.dto.UserBodyImperialValuesDTO;
import org.shahid.model.UserBodyValues;

@Mapper
public interface UserBodyValuesMapper {

    UserBodyValuesMapper INSTANCE = Mappers.getMapper(UserBodyValuesMapper.class);

    @Named("inchToCentimeter")
    public static double inchToCentimeter(int inch) {
        return inch * 2.54;
    }

    @PoundToKilogram
    public static double poundToKilogram(int pound) {
        return pound * 0.4535;
    }

    @Mapping(source = "inch", target = "centimeter", qualifiedByName = "inchToCentimeter")
    @Mapping(source = "pound", target = "kilogram", qualifiedBy = PoundToKilogram.class)
    public UserBodyValues userBodyValuesMapper(UserBodyImperialValuesDTO dto);
}
