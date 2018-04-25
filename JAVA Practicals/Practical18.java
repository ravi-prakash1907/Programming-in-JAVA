public class Practical18 {
  public static void main(String args[]) {

    int a, b,c;

    try {

      b=0;
      a=15;
       c=a/b;

      System.out.println("in try block");

    }

    catch (ArithmeticException e) {

      System.out.println("Division by zero not Possible!");

    }

    System.out.println("out of try block");
  }

}
