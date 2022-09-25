package org.shahid.util;

import java.util.List;

public class IterableNonIterableUtil {

    @FirstElement
    public <T> T first(List<T> in) {
        if (in != null && !in.isEmpty()) {
            return in.get(0);
        } else {
            return null;
        }
    }

    @LastElement
    public <T> T last(List<T> in) {
        if (in != null && !in.isEmpty()) {
            return in.get(in.size() - 1);
        } else {
            return null;
        }
    }


}
