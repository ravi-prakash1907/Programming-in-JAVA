/**
 * Auto Generated Java Class.
 */
import Practical16interface.*;
public class Practical16  {
   
 public static void main(String args[])
 {
   
  Practical16implements  p1= new Practical16implements();
  for(int i=1;i<=4;++i)
  {
   System.out.println(p1.fibo(i)); 
    
  }
   
   
 }
  
}
class Practical16implements implements Practical16interface
{
  
  public int fibo(int n)
  {
    
   if(n<=0)  return 0;
   else if(n==1 || n==2) return 1;
   else return  fibo(n-1)+fibo(n-2);    
    
  } 
  
  
  
}
  

