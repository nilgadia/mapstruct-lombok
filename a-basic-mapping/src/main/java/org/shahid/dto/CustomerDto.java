package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomerDto {

    public Long id;
    public String customerName;
    public List<OrderItemDto> orders;
}
