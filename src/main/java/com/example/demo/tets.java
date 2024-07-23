package com.example.demo;

import java.beans.Transient;

interface tets {
    int a=10;
    int getA();
    private int a(){
        return 10;
    }
    default String ann(){
        return "1ww0";
    }
}
abstract class ttt{
    int a =10;

    int abb() {
        return 0;
    }

    static void aaa(){

    }
}


 interface tet1 {
    int a=10;
    public int a11();

}

class demo implements tets, tet1 {
    @Override
    public int a11() {
        return 111;
    }

    @Override
    public int getA() {
        return 0;
    }
}




class A{
     int add(int a,long b){
         return 10;
     }
    int add(long a,int b){
         return 11;
    }
//    int add(int a,int b){
//        return 10;
//    }
     static void run(){
         System.out.println("A");
     }
    void run11(){
        System.out.println("A11");
    }
}
class B extends A{
    static void run(){
        System.out.println("B");
    }
    void run11(){
        System.out.println("B11");
    }
}




