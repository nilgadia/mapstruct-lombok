package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxRecord {

    private int number;

    private int year;

    private LegalEntity legalEntity;
}
