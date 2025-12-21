package com.example.data_structure.referrence_area;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student2{
    String name;
    Integer marks;

    public Student2(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
}
public class Demo15_HighestAverageMarks {

    public static Double getHighestAverageMarks(List<Student2> students){

       Map<String,Double> averageByName =students.stream()
               .collect(
                       Collectors.groupingBy(
                               Student2::getName,
                               Collectors.averagingInt(Student2::getMarks)
                       )
               );

       return averageByName.values().stream()
               .max(Double::compare)
               .orElse(-1.0);
    }

//    public static void getOptionalNameWithHighestAverageMark(List<Student2> students){
//        Map<String ,Double> averageByName =students.stream()
//                .collect(Collectors.groupingBy(
//                        Student2::getName,
//                        Collectors.averagingInt(Student2::getMarks)
//                ));
//
//        averageByName.entrySet()
//                .stream()
//                .max(Map.Entry.comparingByValue())
//                .ifPresent(entry-> System.out.println("The top performer "+ entry.getKey() +"has highest score "+entry.getValue()));
//    }

    public static double withoutStreams(List<Student2> students){
        Map<String , Integer> totalMarks = new HashMap<>();
        Map<String , Integer> countMarks = new HashMap<>();

        for(Student2 s :students){
            totalMarks.put(s.name,totalMarks.getOrDefault(s.name,0)+s.marks);
            countMarks.put(s.name,countMarks.getOrDefault(s.name,0)+1);
        }

        double maxAverage = Double.NEGATIVE_INFINITY;

        String topScorer = "";


        for (String name : totalMarks.keySet()) {
            double average = (double) totalMarks.get(name) / countMarks.get(name);
            if (average > maxAverage) {
                maxAverage = average;
                topScorer = name;
            }
        }


        System.out.println("Top Scorer: " + topScorer + " with average " + maxAverage);
        return maxAverage;



    }
    public static void main(String[] args) {

//        Object[][] details = {
//                {"Charles", 84},
//                {"John", 100},
//                {"Andy", 37},
//                {"John", 23},
//                {"Charles", 20}
//        };

        List<Student2> students = List.of(
            new Student2("Charles", 84),
            new Student2("John", 100),
            new Student2("Andy", 37),
            new Student2("John", 23),
            new Student2("Charles", 20)
        );

//        System.out.println(getHighestAverageMarks(students));;
//        getOptionalNameWithHighestAverageMark(students);

        System.out.println(withoutStreams(students));



    }
}
