/**
 * Auto Generated Java Class.
 */
public class Practical6 {
  
  
  public static void main(String args[]) { 
    
  int n;
    int result=1;
    
      n=Integer.parseInt(args[0]);
      for(int i=2;i<=n/2;++i)
      {
        if(n%i==0)
          result=0;    
  }
  if(result==1)
    System.out.println("prime");
  else
    System.out.println("not prime");
}
}