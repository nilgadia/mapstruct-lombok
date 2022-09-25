package org.shahid;

import java.util.Arrays;


public class Main {

    private Main() {
    }

    public static void main(String[] args) {
        Source s = new Source();
        s.setMyIntegers(Arrays.asList(5, 3, 7));
        s.setMyStrings(Arrays.asList("five", "three", "seven "));

        Target t = SourceTargetMapper.MAPPER.toTarget(s);
        System.out.println(t.getMyInteger());
        System.out.println(t.getMyString());
    }
}
