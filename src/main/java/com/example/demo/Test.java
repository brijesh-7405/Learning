package com.example.demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> receiverEmails = Arrays.asList("email1@example.com", "email2@example.com", "email3@example.com");

        // Convert List to Array
        String[] receiverEmailsArray = receiverEmails.toArray(new String[0]);

        // Print the array to verify
        System.out.println(Arrays.toString(receiverEmailsArray));
        String str = "Brijesh";
        char[] arr = str.toCharArray();

        for(int i=str.length()-1;i>=0;i--){
            System.out.print(arr[i]);

        }
//        B.run();
//        A.run();
//        A a = new B();
//        a.run11();
////        System.out.println(a.add(2,2));
//        demo dd = new demo();
//        dd.ann();

//        String[] ww  = {"one", "two"};
//        int[] abb = new int[4];
//        abb[0] =1;
//        abb[1] =2;
//        var aaa= Arrays.asList(ww);
//        var wwww= Arrays.asList(abb);
//        System.out.println("wwww: "+wwww);
        
//        for (int i=0; i<wwww.size(); i++){
//            for (int j=0; j<wwww.get(i).length; j++){
//                System.out.println(wwww.get(i)[j]);
//            }
//        }
//        abb[2] =10;
//        for (int i=0; i<wwww.size(); i++){
//            for (int j=0; j<wwww.get(i).length; j++){
//                System.out.println(wwww.get(i)[j]);
//            }
//        }
//        wwww.stream().toList()
//        System.out.println(aaa.contains("one"));
//        System.out.println(wwww.contains(1));
//
//        List<Integer> set = new ArrayList<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        Set<Integer> set1 = Set.copyOf(set);
//        for(int i = 0; i < set.size(); i++){
//          if(set.get(i)==1) {
//              set.remove(i);
//          }
//        }
//        set.stream().forEach(e-> System.out.println("ee: "+e));
//
//        List<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//
//        // Using an Iterator
//        System.out.println("Using an Iterator:");
//        try {
//            Iterator<String> iterator = list.iterator();
//            while (iterator.hasNext()) {
//                String item = iterator.next();
//                System.out.println(item);
//                if (item.equals("B")) {
//                    list.remove(item); // This should cause ConcurrentModificationException
//                }
//            }
//        } catch (ConcurrentModificationException e) {
//            System.err.println("Caught ConcurrentModificationException: " + e);
//        }
//
//        // Reset the list for the next example
//        list.clear();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//
//        // Using an enhanced for-loop
//        System.out.println("Using an enhanced for-loop:");
//        try {
//            for (String item : list) {
//                System.out.println(item);
//                if (item.equals("A")) {
//                    list.remove(item); // This should also cause ConcurrentModificationException
//                }
//            }
//        } catch (ConcurrentModificationException e) {
//            System.err.println("Caught ConcurrentModificationException: " + e);
//        }

    }
}