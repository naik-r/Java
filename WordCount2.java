import java.io.*;
import java.lang.*;
public class WordCount2 {
  static int wordcount(String string) {
  int count=0;
  char ch[]=new char[string.length()];
for(int i=0;i<string.length;i++) {
   ch[i]= string.charAT(i);
   if (((i>0)&&(ch[i]!=' '))&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i>0)){
    count++;
 }
 return count;
}
  public static void main(String args[]) {
    String string="my name is rahul";
    System.out.print(wordcount(string)+" ");
}
} 