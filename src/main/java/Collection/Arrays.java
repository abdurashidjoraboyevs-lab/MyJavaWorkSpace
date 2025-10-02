package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arrays {
    public static void main(String[] args) {

//        ArrayList<String> names = new ArrayList<>();
//        names.add("Sanjar");
//        names.add("Shaqi");
//        names.add("Nodir");
//
//        for (String name : names){
//            System.out.println(names);
//        }

//        ArrayList<Integer> numbers = new ArrayList<>();
//        int c = 10;
//        for (int i = 0; i <= c; i++) {
//            numbers.add(i);
//        }
//        for (Integer number : numbers){
//            System.out.println(numbers);
//        }

//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            numbers.add(i);
//        }
//        numbers.removeIf(n -> n % 2 != 0);
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Sanjar");
//        names.add("Shaqi");
//        names.add("Nodir");
//
//        if (names.contains("Sanjar")){
//            System.out.println("bor");
//        }else {
//            System.out.println("yoq");
//        }
//
//        LinkedList<String> tasks = new LinkedList<>();
//        tasks.add("dam");
//        tasks.add("hordiq");
//        tasks.add("dacha");
//
//        tasks.removeFirst();
//
//        System.out.println(tasks);

//        LinkedList<Integer> nums = new LinkedList<>();
//        nums.add(1);
//        nums.add(2);
//        nums.add(3);
//
//        nums.addFirst(1);
//        nums.addLast(1);
//        System.out.println(nums);

        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        nums.remove(2);
        System.out.println(nums);


    }
}
