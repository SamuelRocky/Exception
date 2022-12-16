package exceptionhandling;

public class NullPointer {
	public static void main(String[] args) {
		
	
	String a=null;
	String b="samuel";
	try {
		
	System.out.println(b+a);
	System.out.println(b.toLowerCase());
	System.out.println(a.toUpperCase());
	}
	catch(Exception e) {
		System.out.println(e);
	}

	}

}
