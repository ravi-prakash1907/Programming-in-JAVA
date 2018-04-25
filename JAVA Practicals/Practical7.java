/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Practical7 {
  
  
  public static void main(String args[]) { 
    
  int n;
    int sum=0;
    
      
      n=Integer.parseInt(args[0]);
      Scanner s= new Scanner(System.in);
      for(int i=0;i<=n-1;++i)
      {
       System.out.println("enter a no");
       sum=sum+s.nextInt();
        
        
      }
    System.out.println("sum=  "+sum);
}
}