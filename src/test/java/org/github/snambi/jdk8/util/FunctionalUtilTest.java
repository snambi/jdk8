package org.github.snambi.jdk8.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

public class FunctionalUtilTest {

    @Test
    public void add1(){

        Function<Integer, Integer> adder = FunctionalUtil::add1;

        Integer x =7;
        Integer y = adder.apply(x);

        System.out.println( String.format("%d %d", x, y));
        Assert.assertTrue(y==(x+1));

    }

    @Test
    public void adder(){

        Function<Integer, Function<Integer,Integer>> adderFn = FunctionalUtil::adder;

        Function<Integer,Integer> plus1 = adderFn.apply(1);
        Function<Integer,Integer> plus2 = adderFn.apply(2);

        int x =4;
        Integer y = plus1.apply(x);
        Integer z = plus2.apply(x);

        System.out.println(String.format("%d %d %d",x,y,z ));

        Assert.assertTrue(true);
    }

    @Test
    public void append1(){

        System.out.println(FunctionalUtil.APPEND1.apply(5));

        Assert.assertTrue(true);
    }

}
