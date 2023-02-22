
import java.util.Scanner;
 class Fib {
  public static void main(String args[]) {
  int i,a=1,b=1,c=0,n;
  Scanner input=new Scanner(System.in);
  System.out.print("enter the n value: ");
  n=input.nextInt();
  System.out.print(a);
  System.out.print("  "+b);
for(i=0;i<n-2;i++) {
    c=a+b;
    a=b;
    b=c;
  System.out.print("  "+c);
}
System.out.println();
System.out.println(n+" th number of series is: "+c);
  }
 }