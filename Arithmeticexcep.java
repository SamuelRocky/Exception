package exceptionhandling;

public class Arithmeticexcep {
	public static void main(String[] args) {
		int a=5;
		int b=2;
		int c=0;
		
		try {
			System.out.println(a/b);
			
			
			
			System.out.println(a/c);
		
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(a/b);
	}

}
