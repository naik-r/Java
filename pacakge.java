import p1.Addition;
class AddMain 
 {
public static void main(String[] args) {
 p1.Additon add=new p1.Additon();
  add.Add();
 }
}
 package p1;
 public class Addition {
  int a=10,b=20;
  public void Add() 
{
 System.out.println("After performing Additon the value is"+(a+b));
}
} 