import java.util.Scanner;
 class Student {
     private String name;
     private int age;
     private int m1;
     private int m2;
     private int m3;
     private int maximum;
     private double average;
public Student (String n,int a,int s1,int s2,int s3) {
    name=n;
    age =a;
    m1 =s1;
    m2 =s2;
    m3 =s3;
}      
public Student() {
    name="";
    age =0;
    m1=0;
    m2=0;
    m3=0;
    maximum=0;
    average=0;
}
public void accept() {
    Scanner in=new Scanner(System.in);
    System.out.print("enter the name");
    name=in.nextLine();
    System.out.print("enter the age");
    age=in.nextInt();
    System.out.print("enter the marks of 1 subject");
    m1=in.nextInt();
    System.out.print("enter the marks of 2 subject");
    m2=in.nextInt();
    System.out.print("enter the marks of 3 subject");
    m3=in.nextInt();
}
public void compute() {
    if(m1>m2&&m2>m3) {
        maximum= m1;
    }
    else if (m2>m3&&m2>m1){
        maximum= m2;
    }
    else 
        maximum= m3;
    average=(m1+m2+m3)/3.0;
}
public void display() {
    System.out.println("Name="+name);
    System.out.println("Age="+age); 
    System.out.println("Subject 1 marks="+m1);
    System.out.println("Subject 2 marks="+m2);
    System.out.println("Subject 3 marks="+m3);
    System.out.println("maximum="+maximum);
    System.out.println("average="+average);   
}
 public static void main(String[] args)  {
     Student obj=new Student("Siva",18,60,70,80);
     
      obj.compute();
      obj.display();  
}
 }