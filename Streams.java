package com.learning.assignments.JAVA;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

}
class Student{
    Integer id;
    String name;
    Integer age;
    String gender;
    String Department;
    Integer yearOfEnroll;
    Double perTillDate;

    @Override
    public String toString() {
        return "name:\t"+name+"\tid:\t "+" age "+age+ " gender: "  +gender + " Department: "+ Department +" yearOfEnroll: " +yearOfEnroll +" perTillDate: "+ perTillDate;
    }

    public Student( Integer id, String name, Integer age,
                    String gender, String Department, Integer yearOfEnroll,
                    Double perTillDate){

        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.Department=Department;
        this.yearOfEnroll=yearOfEnroll;
        this.perTillDate=perTillDate;
    }

    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        Collections.addAll(students,

        new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8),
        new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2),
        new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3),
        new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80.0),
        new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70.0),
        new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70.0),
        new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70.0),
        new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80.0),
        new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85.0),
        new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82.0),
        new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83.0),
        new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4),
        new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6),
        new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8),
        new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4),
        new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4),
        new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5)
        );


        //1.
//        students.stream().forEach(person->{
//            System.out.println(person.Department);
//        });

        //2.
//        Stream<Student> SAbove2018=students.stream()
//                .filter(person-> person.yearOfEnroll>2018);
//        SAbove2018.forEach(person-> System.out.println(person.name));

        //3.
//        Stream<Student> StudentSci=students.stream()
//                .filter(person-> person.Department=="Computer Science");
//        StudentSci.forEach(person-> System.out.println(person));

        //4.
//        students.stream()
//                .collect(Collectors.groupingBy(person->person.gender))
//                .forEach((gender,student)-> System.out.println(gender +"-"+ student.size()));

        //5.
//        OptionalDouble totalMaleAgeSum;
//        OptionalDouble totalFemaleAgeSum;
//        totalMaleAgeSum = students.stream()
//                .filter(person -> person.gender.equals("Male"))
//                .mapToInt(person -> person.age).average();
//        System.out.println("Male age avg: "+totalMaleAgeSum.getAsDouble());
//
//        totalFemaleAgeSum = students.stream()
//                .filter((person) -> person.gender.equals("Female"))
//                .mapToInt(person -> person.age).average();
//        System.out.println("Female age avg: "+totalFemaleAgeSum.getAsDouble());
//
//        System.out.println("Average age of Female and Male Students:");
//        students.stream().collect(Collectors.groupingBy((o->o.gender),Collectors.averagingInt((o->o.age))))
//                .forEach((a,b)-> System.out.println(a+" "+b));
//        System.out.println();
        //6.
//        final Double[] max = {0.0};
//
//         students.stream().forEach(person->{max[0] =Math.max(max[0], person.perTillDate);});
//
//        System.out.println("Max percent: "+max[0]);
//
//        students.stream().forEach(person->{
//            if(max[0].equals(person.perTillDate)){
//                System.out.println(person);
//            }
//        });

        //7.
//        students.stream().collect(Collectors.groupingBy(person->person.Department)).forEach((a,b)->{
//            System.out.println(a+" "+b.size());
//        });

        //8.
//        HashMap<String, ArrayList<Double>> DepartmentAvgPercent=new HashMap<>();
//        students.stream().forEach(person->{
//            if(!DepartmentAvgPercent.containsKey(person.Department)){
//                ArrayList <Double> arr=new ArrayList<>();
//                arr.add(person.perTillDate);
//                arr.add(1.0);
//                DepartmentAvgPercent.put(person.Department, arr);
//            }
//            else{
//               Double percent= DepartmentAvgPercent.get(person.Department).get(0);
//               percent+=person.perTillDate;
//               Double ppl=DepartmentAvgPercent.get(person.Department).get(1)+1;
//               ArrayList<Double> arr=new ArrayList<>();
//               Collections.addAll(arr,percent,ppl);
//               DepartmentAvgPercent.put(person.Department, arr);
//            }
//        });
//        DepartmentAvgPercent.forEach((name,perc)->{
//            System.out.println(name+"\tAvg Percentage: "+(perc.get(0)/ perc.get(1)));
//        });

//        students.stream().collect(Collectors.groupingBy((p->p.Department),Collectors.averagingDouble(p->p.perTillDate)))
//                .forEach((a,b)->{
//                    System.out.println(a+" +"+b);
//                });

        //9.
//        System.out.println("Youngest student in Electronics Department:");
//        Optional<Student> all= students.stream().filter(o->o.Department.equals("Electronic") && o.gender.equals("Male"))
//                .min((o1, o2) -> Integer.compare(o1.age , o2.age));
//        System.out.println(all.get().toString());
//        System.out.println();

        //10.
        System.out.println("Number of Female and Male in Computer Science Department:");
        students.stream().filter(o->o.Department.equals("Computer Science")).collect(Collectors.groupingBy(o->o.gender))
                .forEach((a,b)-> System.out.println(a+" "+b.size()));
        System.out.println();
    }

}
