package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class demoInterface implements DemoInterface{
    @Override
    public void isStatic() {
        DemoInterface.demo();
    }

    @Override
    public void getData() {
        System.out.println("Overrided Default Methods");
    }


}

interface DemoInterface{
    int i =10;
    void isStatic();
    default void getData(){
        System.out.println("default getData");
    }
    static void demo(){
        System.out.println("hello");
    }
}


class Main{
//    static List<Integer> get(List<Integer> list){
//        for(int i=0; i<list.size(); i++){
//            int original = list.get(i);
//            while( list.get(i)%5 != 0){
//                ++;
//            }
//            int subtract = i - original;
//            if(subtract > 3){
//                i -= subtract;
//            }
//            list.set(i,);
//        }
//        return list;
//    }

    public static void main(String[] args) {
//       List<Integer> result =  get(Arrays.asList(43,55,91,99));
//       result
//                .stream().forEach(list -> System.out.print(list+" "));
//        DemoInterface dd = new demoInterface();
//        dd.getData();
//        dd.isStatic();
    }
}

class Animal{
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

class Cat extends Animal{
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}
