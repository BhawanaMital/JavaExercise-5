package com.stakeroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
          }

    @Test
    public void returnAgeNameIdOfStudent(){
        List<Student> students=new ArrayList<>();
        Student obj1 = new Student(1, "Tushar", 27);
        Student obj2 = new Student(2, "Yogesh", 23);
        Student obj3 = new Student(3, "Aditya", 37);
        Student obj4 = new Student(7, "Aryan", 23);
        Student obj5 = new Student(5, "Aditya", 29);
        Student obj6 = new Student(6, "Tushar", 22);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);
        Collections.sort(students,new StudentSorter());

        String expected="[Student{id=3, name='Aditya', age=37}, Student{id=5, name='Aditya', age=29}, Student{id=1, name='Tushar', age=27}, Student{id=2, name='Yogesh', age=23}, Student{id=7, name='Aryan', age=23}, Student{id=6, name='Tushar', age=22}]";
        assertEquals(expected, students.toString());


    }
}



