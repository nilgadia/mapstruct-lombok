package org.shahid.mapper.util;

import org.mapstruct.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class RoundingUtil {


    @Fraction2
    public BigDecimal fraction2(BigDecimal in) {

        return in == null ? null : in.setScale(2, RoundingMode.DOWN);
    }

    @Fraction3
    public BigDecimal fraction3(BigDecimal in) {

        return in == null ? null : in.setScale(3, RoundingMode.DOWN);
    }


    @Qualifier
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Fraction2 {
    }

    @Qualifier
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public static @interface Fraction3 {
    }

}
