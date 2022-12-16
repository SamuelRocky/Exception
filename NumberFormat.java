package exceptionhandling;

public class NumberFormat {

	public static void main(String[] args) {
       
       String a="sam";

       try {
    	   
    	   int b=Integer.parseInt(a);
    	   System.out.println(b);
       }
       catch(Exception e) {
    	   System.out.println(e);
       }
       finally {
    	   System.out.println(a);
       }
	}

}
