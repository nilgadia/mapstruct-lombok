package org.shahid.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class Person {
    private final Long id;
    private final String firstName;
    private final String lastName;
}