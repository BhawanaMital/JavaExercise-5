package com.stakeroute.exercise5;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListUpdateTest {
    ArrayListUpdate arrayListUpdate;
    @org.junit.Before
    public void setUp() throws Exception {
        arrayListUpdate=new ArrayListUpdate();
    }


    @org.junit.After
    public void tearDown() throws Exception {
        arrayListUpdate=null;
    }

    @Test

    public void addArray(){
        String expected="[Kiwi, Grape, Mango, Berry]";
        String actual=arrayListUpdate.addArray("Kiwi Grape Mango Berry".split(" ")).toString();
        assertEquals(expected,actual);
    }

    @Test
    public void removeAll(){
        arrayListUpdate.addArray("Kiwi Grape Mango Berry".split(" "));
        String actual=arrayListUpdate.removeAll().toString();
        assertEquals("[]",actual);
    }

    @Test

    public void update(){
        String expected="[Kiwi, Grape, Mango, Berry]";
        arrayListUpdate.addArray("Apple Grape Melon Berry".split(" "));
        arrayListUpdate.update(0,"Kiwi");

        String actual=arrayListUpdate.update(2,"Mango").toString();

        assertEquals(expected,actual);
    }

}