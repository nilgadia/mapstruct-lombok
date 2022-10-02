package org.shahid.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
public class Customer {

    private Long id;
    private String name;
    private Collection<OrderItem> orderItems;
}
