package Day_02_Review;

import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Jack"));
        students.add(new Student(2,"Julia"));
        students.add(new Student(3,"Mark"));
        students.add(new Student(4,"Mary"));


        System.out.println("Printing with legacy for-loop................");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("Printing with iterator................");
        Iterator iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }


        System.out.println("Printing Backwards with iterator................");
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }


        System.out.println("Printing with for_each loop................");
        for (Student student: students){
            System.out.println(student);
        }

        System.out.println("Printing with Lambda function................");
        students.forEach(student -> System.out.println(student));




        System.out.println("Sorting with Comparator Interface by Id Desc................");
        Collections.sort(students, new sortByIdDesc());
        students.forEach(student -> System.out.println(student));

        System.out.println("Sorting with Comparator Interface by Name Desc................");
        Collections.sort(students, new sortByNameDesc());
        students.forEach(student -> System.out.println(student));



    }

    static class sortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
