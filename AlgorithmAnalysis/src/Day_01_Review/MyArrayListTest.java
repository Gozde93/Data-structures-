package Day_01_Review;

import java.util.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        ArrayList<Integer> a = new ArrayList<>();


        MyArrayList list1 = new MyArrayList(5);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        System.out.println(list1.size);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        System.out.println(list1.numbers.length);



    }
}
