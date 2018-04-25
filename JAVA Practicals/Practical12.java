/**
 * Auto Generated Java Class.
 */
import java.lang.*;
public class Practical12 {
  
  public static void main(String args[]){
  
    Distance d1=new Distance(10,20);
    Distance d2= new Distance(10,10);
    Distance d3=new Distance(20,30);
    
    d1.display();
    //System.out.println("metres=  "+d2.metrs);
    //System.out.println("centimetres=  "+d2.centimetrs);
    d1.addDistance(d3);
    d3.display();
    
  }
}
class Distance {
  
 public int feet,inches;
 private int metrs,centimetrs;
   public final int kilo=1000;
 
 Distance(int f,int i)
 {
   metrs=100;
   centimetrs=50;
   this.feet=f;
   this.inches=i;
 }
 void display()
 {
  System.out.println("feet=  "+feet);
  System.out.println("inches=   "+inches);
  System.out.println("metres=  "+metrs);
  System.out.println("inches=   "+centimetrs);
   
 }  
 void addDistance(Distance d3)
 {
   //kilo=2000;
   d3.feet=d3.feet+kilo;
   d3.inches=d3.inches+kilo;
    
}
}