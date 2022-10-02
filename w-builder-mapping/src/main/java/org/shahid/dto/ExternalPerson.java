package org.shahid.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class ExternalPerson {
    private final Long id;
    private final String personFirstName;
    private final String personLastName;
}