import java.util.Scanner; 
class Occurence {
    public static void main(String args[]) {
        int x,i=0,n,count=0;
    Scanner s=new Scanner(System.in);            
    System.out.print("Enter the limit of array:");
    n=s.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++) {
        a[i]=s.nextInt();
    }
    System.out.print("Enter the of which you want to count:");
      x=s.nextInt();
    for(i=0;i<n;i++) {
        if(a[i]==x) {
            count++;
        }
    }
    System.out.print("NO.OF Occurence:"+count);

 
    }
}