package org.shahid.mapper.util;

import org.mapstruct.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

public class MappingUtil {

    @Ip
    public String ip(Map<String, Object> in) {
        return (String) in.get("ip");
    }

    @Server
    public String server(Map<String, Object> in) {
        return (String) in.get("server");
    }

    @Qualifier
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Ip {
    }

    @Qualifier
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public static @interface Server {
    }

}
