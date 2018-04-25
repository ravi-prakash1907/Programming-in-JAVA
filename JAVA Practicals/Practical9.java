/**
 * Auto Generated Java Class.
 */
import java.lang.*;
public class Practical9 {
  
  
  public static void main(String args[]) { 
    
    Distance d1=new Distance(10,20);
    d1.display();
    
}
}
class Distance{
  
 int feet,inches;
 Distance(int f,int i)
 {
   this.feet=f;
   this.inches=i;
 }
 void display()
 {
  System.out.println("feet=  "+feet);
  System.out.println("inches=   "+inches);
   
 }  
  
  
}