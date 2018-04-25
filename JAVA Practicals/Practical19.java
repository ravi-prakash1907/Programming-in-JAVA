class Practcial19{  
  
 public static void main(String args[]){  
  try{  
    System.out.println("outer try block");
    try{  
     System.out.println("inner try block1");  
     int b =39/0;  
    }catch(ArithmeticException e){System.out.println(e);}  
   
    try{  
       System.out.println("inner try block2");
    int a[]=new int[5];  
    a[5]=4;  
    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
     
  }catch(Exception e){System.out.println("exception ");}  
  
   
 }  
}  