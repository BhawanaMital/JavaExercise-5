package com.stakeroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SwapTheStringValueTest {
    SwapTheStringValue swapTheStringValue;
    @Before
    public void setUp() throws Exception {
        swapTheStringValue=new SwapTheStringValue();
    }

    @After
    public void tearDown() throws Exception {
        swapTheStringValue=null;
    }

    @Test
    public void givenTwoStringReturnOneEmptyStringOneswappedValue(){
        Map<String,String> map= new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        ;
        assertEquals("{val2=java, val1= }",swapTheStringValue.emptyString1SwapString2(map).toString());
    }
}