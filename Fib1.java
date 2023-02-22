import java.io.*;
import java.lang.*;
class Fib1{
    
 int fib(int n) {
     if(n==1) {
         return(1);
     }
     else if (n==2) {
         return(1);
     }
     return (fib(n-1)+fib(n-2));
 }    
}
 class FibR {
     public static void main(String args[])throws
     IOException {
         InputStreamReader obj=new
         InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(obj);
         System.out.print("enter the value of n: ");
         int n=Integer.parseInt(br.readLine());
         Fib1 ob=new Fib1();
         System.out.print("fibonacci series is: ");
         int res=0;
         for(int i=1;i<=n;i++) {
             res=ob.fib(i);
             System.out.println();
              System.out.println(n+"th number of the series is: "+res);
         }
     }
 }