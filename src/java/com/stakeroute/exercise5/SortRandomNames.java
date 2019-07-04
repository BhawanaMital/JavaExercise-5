
/*6. Write a program to implement set interface which sorts the given randomly ordered names in*/
package com.stakeroute.exercise5;

import java.util.*;

public class SortRandomNames {
    public String sortNames(String names){
        if (names==null){
            return null;
        }

        //Sorting the string using TreeSet
        SortedSet<String> sortedSet=new TreeSet<>(Arrays.asList(names.split(" ")));

        return new ArrayList<String>(sortedSet).toString();



    }
}
