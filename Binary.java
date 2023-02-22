import java.io.*;
import java.util.Scanner;
class Binary_search {
  public static void main(String args[]) {
int i, low, high, mid, n, key;
 int a[]=new int[100];
System.out.println("Enter size of an array:");
Scanner s =new Scanner(System.in); 
     n=s.nextInt();
System.out.println("Enter elements of an array:\n");
for(i = 0; i < n; i++) {
a[i]=s.nextInt();;
}
System.out.println("Enter value to find \n");
key=s.nextInt();
low = 0;
high = n - 1;
mid = (low+high)/2;
while (low <= high) {
if(a[mid] < key)
low = mid + 1;
else if (a[mid] == key) {
System.out.println("%d found at location %d \n", key, mid+1);
break;
}
else
high = mid - 1;
mid = (low + high)/2;
}
if(low > high)
System.out.println("Not found! %d isn't present in the list \n", key);
  }
}