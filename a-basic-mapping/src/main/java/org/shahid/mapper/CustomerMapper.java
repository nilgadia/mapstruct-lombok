package org.shahid.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.shahid.dto.CustomerDto;
import org.shahid.model.Customer;

@Mapper(uses = {OrderItemMapper.class})
public interface CustomerMapper {

    CustomerMapper MAPPER = Mappers.getMapper(CustomerMapper.class);

    @Mapping(source = "orders", target = "orderItems")
    @Mapping(source = "customerName", target = "name")
    Customer toCustomer(CustomerDto customerDto);

    @InheritInverseConfiguration
    CustomerDto fromCustomer(Customer customer);
}
