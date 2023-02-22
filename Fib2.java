import java.util.Scanner;
 public class Fib2{
 public static void main(String args[]) {
 int a=1,b=1,c=0,n;
 Scanner s=new Scanner(System.in);
 System.out.print("Enter the value of n");
 n=s.nextInt();
 System.out.print(a);
 System.out.print(" "+b);
 for(int i=0;i<n-2;i++) {
   c=a+b;
   a=b;
   b=c; 
  System.out.print(" "+c);
   }
  System.out.print(n+"series is" +c);
 }
}