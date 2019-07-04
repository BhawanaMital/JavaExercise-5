/*4. Create a Student class that represents the following information of a student: id, name, and age
all the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having
same age, sort based on their name.
f. For students having same name and age, sort them according to their ID.*/

package com.stakeroute.exercise5;

import java.util.Comparator;

public class Student {
    private int age;
    private String name;
    private int id;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //Constructor
    public Student(int id, String name, int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }


    //getter and setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}
    class StudentSorter implements Comparator<Student> {

        @Override
        public int compare(Student student1,Student student2){

            //Sorting the value according to the age
            if(student1.getAge()==student2.getAge()) {

                //Sorting the value according to the names
                if (student1.getName().equals(student2.getName())) {
                    return student2.getId() - student1.getId();
                } else {

                    //Sorting the value according to the id
                    return student2.getName().compareTo(student2.getName());
                }
            }
            else {
                return student2.getAge()-student1.getAge();
                }
            }
        }



