package com.example.demo.year;

public class Days {
    public static void main(String[] args) {
        System.out.println("Leap year 2020: "+isLeapYear(2020));
    }

    private static boolean isLeapYear(int year) {
        boolean leapYear;
        int month = 2;
        int numDays = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8:
                case 10: case 12: numDays = 31;
                break;
           case 4: case 6: case 9: case 11: numDays = 30;
                break;
            case 2:
                if( (year % 400 ==0) || (year % 4 ==0 && (year % 100 !=0))){
                    numDays = 29;
                }else {
                    numDays = 28;
                }
                break;
        }
        if( numDays == 29){
            return true;
        }
        return false;
    }
}
