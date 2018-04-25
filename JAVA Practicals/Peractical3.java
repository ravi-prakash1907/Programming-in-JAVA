/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Practical3 {
  
  
  public static void main(String[] args) { 
    
      int n;
      Scanner s= new Scanner(System.in);
     System.out.println("input no of elements");
     n=s.nextInt();
     
      
      
     int ar[]=new int[n];
     
     
     for(int i=0;i<=n-1;++i)
     {
       System.out.println("enter an element");
       ar[i]=s.nextInt();
       
     }
     System.out.println("array  ");
     for(int i=0;i<=n-1;++i)
     {
       System.out.println(ar[i]);
       
       
     }
  }
}