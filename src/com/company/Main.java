package com.company;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeSet<Student> tree = new TreeSet<>();
        tree.add(new Student(1, "Hello"));
        tree.add(new Student(2, "Astan"));
        tree.add(new Student(3, "Ast"));
        tree.add(new Student(4, "Askhat"));
        System.out.println(tree);
//        Set<Integer> setInt = new TreeSet<>();
//        for (int i = 1; i <= 1000; i++){
//            setInt.add(i);
//        }
//        int sumA = 0;
//        Set<Integer> subSetA = ((TreeSet<Integer>) setInt).subSet(5,700);
//        Iterator<Integer> it = subSetA.iterator();
//        while (it.hasNext()){
//            sumA += it.next();
//        }
//        System.out.println("Sum A: " + sumA);
//
//        int sumB = 0;
//        Set<Integer> subSetB = ((TreeSet<Integer>) setInt).headSet(30);
//        Iterator<Integer> itB = subSetB.iterator();
//        while (itB.hasNext()){
//            sumB += itB.next();
//        }
//        System.out.println("Sum B: " + sumB);
//        Set<Character> set = new TreeSet<>();
//        set.add('a');
//        set.add('b');
//        set.add('c');
//        set.add('d');
//        set.add('e');
//        Set<Character> set2 = new TreeSet<>();
//        set2.add('a');
//        set2.add('c');
//        set2.add('d');
//        set2.add('f');
//        set2.add('g');
//
//        System.out.println(set);
//        System.out.println(set2);
//
//        set.addAll(set2);
////        Iterator<Character> it = set2.iterator();
////        while (it.hasNext()){
////            //set.add(it.next());
////            char el = it.next();
////            if (!set.contains(el)){
////                set.add(el);
////            }
////        }
//        System.out.println(set);
//        set2.add('k');
//        System.out.println(set2);
//        Iterator<Character> it = set.iterator();
//        while (it.hasNext()){
//            set2.remove(it.next());
//
//        }
////        {1,2,3,4,5,6}
////        {}
////        {2,3}
//        System.out.println(set2);
    }
}
