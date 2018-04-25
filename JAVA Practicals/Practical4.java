/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Practical4 {
  
  
  public static void main(String[] args) { 
    
      int m1[][]=new int[3][3];
      int m2[][]=new int[3][3];
                         
                         
      Scanner s= new Scanner(System.in);
     
     
     
     System.out.println("First array"); 
    for(int i=0;i<=2;++i)
          for(int j=0;j<=2;++j)
          {
            System.out.println("enter array element");
            m1[i][j]=s.nextInt();            
      
      
                 }
      System.out.println("Second array"); 
    for(int i=0;i<=2;++i)
          for(int j=0;j<=2;++j)
          {
            System.out.println("enter array element");
            m2[i][j]=s.nextInt();            
      
      
                 }
      System.out.println("Sum of arrays"); 
    for(int i=0;i<=2;++i)
          for(int j=0;j<=2;++j)
          {
            System.out.println("sum array element");
            System.out.println(m1[i][j]+m2[i][j]);          
      
      
                 }
     
  }
}