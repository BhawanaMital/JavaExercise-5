package com.stakeroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortRandomNamesTest {
    SortRandomNames sortRandomNames;
    @Before
    public void setUp() throws Exception {
        sortRandomNames=new SortRandomNames();
    }

    @After
    public void tearDown() throws Exception {
        sortRandomNames=null;
    }

    @Test
    public void givenStringReturnSortedText(){
        String expected="[Alice, Bluto, Eugene, Harry, Olive]";
        String actual=sortRandomNames.sortNames("Harry Olive Alice Bluto Eugene");
        assertEquals(expected,actual);
        assertNotNull(actual);
    }
}