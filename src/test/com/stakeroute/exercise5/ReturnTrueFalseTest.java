package com.stakeroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnTrueFalseTest {
    ReturnTrueFalse returnTrueFalse;

    @Before
    public void setUp() throws Exception {
        returnTrueFalse=new ReturnTrueFalse();
    }

    @After
    public void tearDown() throws Exception {
        returnTrueFalse=null;
    }

    @Test
    public void givenStringShouldReturnBoolean(){
        String arr[] = {"a","b","c","d","a","c","c"};
        String actual=returnTrueFalse.checkFrequencyOfCharacter(String.join(" ",arr)).replaceAll("=",":");
        assertEquals("{a:true, b:false, c:true, d:false}",actual);
        assertNotNull(actual);
    }



    @Test
    public void givenStringShouldReturnNull() {
        String actual = returnTrueFalse.checkFrequencyOfCharacter(null);
        assertNull(actual);
    }
}