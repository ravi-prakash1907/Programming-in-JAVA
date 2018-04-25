/**
 * Auto Generated Java Class.
 */
import java.lang.*;
public class Practical8 {
  
  
  public static void main(String args[]) { 
    
  String s1=new String("abc");
  StringBuffer s2= new StringBuffer("def");
  
    //System.out.println("setChatAt  "+s1.setCharAt(0,'n'));
    //System.out.println("setLength  "+s1.setLength(1));
    //String s3=s1.append("aaa");
    //System.out.println("append  "+s3);
    String s3=s1.concat("bbb");
    System.out.println("concat  "+s3);
    System.out.println("equals  "+s1.equals("abc"));
    
    s2.setCharAt(1,'z');
    System.out.println("setChatAt  "+s2);
    s2.setLength(2);
    System.out.println("setLength  "+s2);
    System.out.println("append  "+s2.append("ddd"));
    //s2.concat("hdhdh");
   // System.out.println("concat  "+s2);
    System.out.println("equals  "+s2.equals("abc"));
    
    
}
}