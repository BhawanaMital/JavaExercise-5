/*2. Write a program to find the number of counts in the following ​ String​ . Store the output in
Map<​ String​ ,Integer> as key value pair.
Input : ​ String​ str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}
**/

package com.stakeroute.exercise5;

import java.util.*;

public class StringCount {        // // hashmap to store the frequency of element


    public static String countFrequencies(String strings){
        if (strings==null)
            return null;

        // // hashmap to store the frequency of element
        Map<String,Integer> map=new HashMap<String,Integer>();

        //To convert the strings to array list
        List<String> stringList= Arrays.asList(strings.split("[\\W_]+"));
        for (String i:stringList) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }

            // displaying the occurrence of elements in the arraylist
//        for (Map.Entry<String,Integer> value:map.entrySet()){
//            return (value.getValue()+":"+value.getKey());
//        }
        }
        return map.toString();
    }

}
