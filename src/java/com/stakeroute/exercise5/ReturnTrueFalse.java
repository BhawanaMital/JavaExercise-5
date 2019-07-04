/*3. Write a program where an array of strings is input and output is a Map<​ String​ ,boolean> where
each different ​ string​ is a key and its value is true if that ​ string​ appears 2 or more times in the array
Input :​ ​ String​ arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}*/

package com.stakeroute.exercise5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnTrueFalse {

    public static String checkFrequencyOfCharacter(String string){
        if(string==null){
            return null;
        }


        //Creating Map object to store the key and value
        Map<String,Integer> map=new HashMap<String,Integer>();

        //Spliting the String by removing special character and non-words
        List<String> stringList= Arrays.asList(string.split("[\\W_]+"));
        for(String s:stringList){
            if (map.containsKey(s)){
                map.replace(s,map.get(s)+1);

            }else {
                map.put(s,1);
            }
        }

        //Created a map to store the key and value
        Map<String,Boolean> booleanMap=new HashMap<>();
        for (String s:map.keySet()){
            if (map.get(s)>=2){
                booleanMap.put(s,true);
            }
            else {
                booleanMap.put(s,false);
            }
        }
        return booleanMap.toString();
    }
}
