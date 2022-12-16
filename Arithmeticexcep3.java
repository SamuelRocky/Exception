package exceptionhandling;

public class Arithmeticexcep3 {

	public static void main(String[] args) {
       int a=5;
       int b=2;
       int c=0;
       try {
    	   System.out.println(b);
    	   System.out.println(a/c);
       }
       catch(NullPointerException n) {
    	   System.out.println(n);
       }
       catch(IndexOutOfBoundsException i) {
    	   System.out.println(i);
       }
       catch(NumberFormatException m) {
    	   System.out.println(m);
       }
       catch(Exception e) {
    	   System.out.println(e);
       }
	}

}
