package exceptionhandling;

public class ArrayIndex {

	public static void main(String[] args) {
       String[] a= {"sam","ram","sanga"};
       try {
    	   System.out.println(a[0]);
    	   System.out.println(a[3]);
    	   
       }
       catch(Exception e) {
    	   System.out.println(e);
       }
       finally {
    	   System.out.println(a[1]);
       }
	}

}
