
public class Practical20 {
   
  static void checkValidity(int a, int b){ 
      if(a>12 && b>40) {
         throw new ArithmeticException("input data incorrect"); 
                   }
      else {
         System.out.println("Data Valid!!"); 
          }
       }

   public static void main(String args[]){ 
     int c,d;
        try{
             System.out.println("Please enter data!!");
             c=10;d=39;
             System.out.println("entered data= "+c+"  "+d);
             checkValidity(c, d); 
             System.out.println("Please enter data!!");
             c=20;d=50;
             System.out.println("entered data= "+c+"  "+d);
             checkValidity(c,d);
        }catch(ArithmeticException e){System.out.println("exception caught");}
          } 
   }