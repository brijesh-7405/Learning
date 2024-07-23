package com.example.demo;

public class Practice {
    public static void main(String[] args) {
        int p1=6;
//        for (int i = 1; i <= p1; i++) {
//            for (int j = 1; j < p1; j++) {
//                if(i==1 || i==p1 || j==1 || j==(p1-1)) {
//                    System.out.print("*\t");
//                }else{
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }

        //i=1  j=4    1
        //i-2  j=3,4  22
        //i=3  j=2,3,4 333
        //i=4  j=1234  4444
//        for(int i = 1; i <= p1; i++) {
//            for(int j = 1; j <= (2*p1-1); j++) {
//                if(j==p1){
//                    System.out.print(i+" ");
//                }
////                System.out.print(" ");
////            }
////            for(int j = 1; j <= i; j++) {
////                    System.out.print(i+" ");
////            }
//            if(j==i){
//                System.out.print(i+" ");
//            } else if (j==p1-i) {
//                System.out.print(" ");
//            }
//
//            }
//
//            System.out.println();
//
//        }
//        int i, j;
//        // outer loop to handle number of rows
//        for (i = 1; i <= n; i++) {
//            // inner loop to print space
//            for (j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            // inner loop to print star
//            for (j = 1; j <= i; j++) {
//                System.out.print(i + " ");
//            }
//            // print new line for each row
//            System.out.println();
//        }


//        for(int i = 1; i <= p1; i++) {
//            for(int j=1;j<i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        int c=1;
//        for(int i = 1; i <= p1; i++) {
//            for(int j=1;j<=i;j++){
//                System.out.print(c+"\t");
//                c++;
//            }
//            System.out.println();
//        }

        // 1        i=1, j=1
        // 0 1       i=2, j=1,2
        // 1 0 1    i=3, j=1,2,3
        // 0 1 0 1
//        for(int i = 1; i <= p1; i++) {
//            for(int j=1;j<=i;j++) {
//                if(isEven(i)) {
//                    if (i == j || j % 2 ==0)
//                        System.out.print("1\t");
//                    else
//                        System.out.print("0\t");
//                }
//                else {
//                    if (i == j ||  j % 2 !=0)
//                        System.out.print("1\t");
//                    else
//                        System.out.print("0\t");
//                }
//            }
//            System.out.println();
//        }


//        for(int i = 1; i <= p1; i++) {
//            for(int j=1;j<=i;j++) {
//                    if ((i + j )% 2 ==0)
//                        System.out.print("1\t");
//                    else
//                        System.out.print("0\t");
//            }
//            System.out.println();
//        }


//        1
//        2	1	2
//        3	2	1	2	3
//        4	3	2	1	2	3	4
//        5	4	3	2	1	2	3	4	5
//        6	5	4	3	2	1	2	3	4	5	6

//        for(int i = 1; i <= p1; i++) {
//            for(int j=p1; j>=1; j--) {
//                if(j<=i) {
//                    System.out.print(j + "\t");
//                }
//                else {
//                    System.out.print("\t");
//                }
//            }
//            for(int j=2;j<=i;j++){
//                System.out.print(j + "\t");
//            }
//            System.out.println();
//        }


        for (int i = 1; i <= p1; i++) {
            for (int j = 1; j <= p1; j++) {
                if(j<p1-1){
                    System.out.print(" ");
                }else
                System.out.print("*");
            }
            System.out.println();

        }

//        int m=1;
//        for(int i = 1; i <= p1; i++) {
//            for(int j=(2*p1-1); j>=1; j--) {
//                if(j==p1 || j<(p1+i) ){
//                    if(j==p1) {
//                        System.out.print((j - p1 + 1) + "\t");
//                    }
//                    else if(){
//                        System.out.print((p1 - j + i+1) + "\t");
//                    }
//                    else{
//                        System.out.print("\t");
//                    }
//                }
//                else {
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }




        //1
        //21
        //321
        //4321
        //54321
//        for(int i = 1; i <= p1; i++) {
//            for(int j=i;j>=1;j--){
//                System.out.print(j+"\t");
//            }
//            System.out.println();
//        }
    }
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
}
