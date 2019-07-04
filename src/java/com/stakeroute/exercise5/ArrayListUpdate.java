/*1. Write a Java program to update specific array element by given element and empty the ​ array list​ .
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list​ after removing all elements []
* */


package com.stakeroute.exercise5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdate {
    private List<String> stringList=new ArrayList<>();

    //convert array of String to List

    public List<String> addArray(String[] inputArray){
        for (String input:inputArray){
            stringList.add(input);
        }
        return stringList;
    }

    //remove all element of List

    public List<String> removeAll(){
        stringList.clear();
        return stringList;
    }

    //replace list value with respective index
    public List<String> update(int index,String value){
        stringList.set(index,value);
        return stringList;
    }
}
