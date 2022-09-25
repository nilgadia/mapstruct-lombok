package org.shahid.entities;


import lombok.Getter;
import lombok.Setter;
import org.shahid.mapper.annotations.Treatment;

@Getter
@Setter
public class TaxRecordPE {

    private int number;

    private int year;

    private LegalEntityPE legalEntity;

    @Treatment(formatAs = "organisation")
    public void setLegalEntity(LegalEntityPE legalEntity) {
        this.legalEntity = legalEntity;
    }

}
