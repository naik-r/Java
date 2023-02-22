import java.util.*;
public class Week4a {
 public static void main(String[] args) {
 char ch;
 do{
 System.out.println("1.add"); 
 System.out.println("2.sub");
 Scanner i=new Scanner(System.in);
 System.out.println("enter the option");
 int option=i.nextInt();
 System.out.println("Enter the two numbers: ");
 int a=i.nextInt();
 int b=i.nextInt();
 switch(option) {
  case 1:
        System.out.println(a+b);
        break;
 case 2:
        System.out.println(a-b);
        break;
 default:
        System.out.println("invalid choice");
        break;
 }
  System.out.println("DO YOU WANT TO CONTINUE ? /n PRESS Y (OR) y IF YES ELSE PERSS ANY OTHER KEY");
 ch=i.next().charAt(0);
 }while(ch=='y'||ch=='Y');
 }
 }
 

