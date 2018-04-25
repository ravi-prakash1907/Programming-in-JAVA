/**
 * Auto Generated Java Class.
 */
import java.lang.*;
public class Practical10 {
  
  
  public static void main(String args[])throws CloneNotSupportedException { 
    
    try
    {
    Distance d1=new Distance(10,20);
    d1.display();
    Distance d2=d1;
    d2.display();
    Distance d3=(Distance)d1.clone();
    d3.display();
    }catch(CloneNotSupportedException e){ System.out.println("error");  }
}
  
}
class Distance implements Cloneable{
  
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
  public Object clone() throws CloneNotSupportedException
  {
     return super.clone(); 
  }
  
}