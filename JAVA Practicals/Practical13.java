/**
 * Auto Generated Java Class.
 */
import java.lang.*;
public class Practical13 {
  
  public static void main(String args[]){
  
    Distance d1=new Distance(10,20);
    d1.display();
    d1.addDistance();
    d1.addDistance();
    d1.varDistance(10,20,30,40);
    
  }
}
class Distance {
  
 public int feet,inches;
 static int total=0;
 
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
 public static void addDistance()
 {
   
   total=total+10;
   System.out.println("total=   "+total);
  
    
}
 public void varDistance(int ... a)
 {
   
   for(int i:a)
   {
     System.out.println(i); 
   }
   
   
 }
}