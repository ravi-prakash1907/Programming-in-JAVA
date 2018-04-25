/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Practical2 {
  
  
  public static void main(String[] args) { 
    
    
     int n,fact;
     Scanner s= new Scanner(System.in);
     System.out.println("input a number");
     n=s.nextInt();
     fact=1;
     for(int i=1;i<=n;++i)
     {
       fact=fact*i;
     }
     System.out.println("Factorial=   "+fact);
}
}