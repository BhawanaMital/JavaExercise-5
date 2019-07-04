package com.stakeroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount stringCount;

    @Before
    public void setUp() throws Exception {
        stringCount=new StringCount();
    }

    @After
    public void tearDown() throws Exception {
        stringCount=null;
    }

    @Test
    public void testForCountOccuranceOfString(){
        String actual=stringCount.countFrequencies("one one -one___two,,three,one @three*one?two");
        assertEquals("{one=5, two=2, three=2}",actual);
        assertNotNull(actual);
    }

    @Test
    public void testForNullValue(){
        String actual=stringCount.countFrequencies(null);
        assertNull(actual);
    }


}