package org.github.snambi.jdk8.util;

import java.util.function.Function;

public class FunctionalUtil {

    public static Function<Integer,String> APPEND1 = y -> String.format("%d%d", y, 1);

    public static Integer add1(Integer x) {
        return x+1;
    }

    public static Function<Integer, Integer> adder(int x){
        return y -> x+y;
    }

}
