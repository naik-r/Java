import java.io.*;
 class Additon {
     public int add(int a,int b,int c) {
         int sum=a+b+c;
         return sum;
     }
     public double add(double a,double b,double c) {
         double sum =a+b+c;
         return sum;
     }
     public int add(int a ,int b, int c ,int d) {
         int sum= a+b+c+d;
         return sum;
     }
 }
 class GFG {
     public static void main(String args[]) {
         Additon ob=new Additon();
         int sum2=ob.add(1,2,3);
         System.out.println("the sum is"+sum2);
         double sum3=ob.add(1.0,2.0,3.0);
         System.out.println("the sum is"+sum3);
         int sum4=ob.add(1,2,3,4);
         System.out.println("the sum is"+sum4);
     }
 }