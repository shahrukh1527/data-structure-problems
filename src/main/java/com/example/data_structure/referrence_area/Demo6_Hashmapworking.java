package com.example.data_structure.referrence_area;

import java.util.HashMap;
import java.util.Map;

class Student{
    private int id;
    private String name;

    public Student(int id,String name){
        this.id = id;
        this.name =name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return id == student.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
}
public class Demo6_Hashmapworking
{
    public static void main(String[] args) {

        Student s1= new Student(101,"ram");
        Student s2= new Student(102,"shyam");
        Student s3= new Student(101,"mohan");

        Map<Student,String> hm = new HashMap<>();

        hm.put(s1,"A Grade");
        hm.put(s2,"B Grade");
        hm.put(s3,"C grade");

        // Retrieving values using keys
        System.out.println("Grade of student1: " + hm.get(s1));
        System.out.println("Grade of student2: " + hm.get(s2));

        // Using student3 (same id as student1) to retrieve value
        System.out.println("Grade of student3: " + hm.get(s3));

    }
}
