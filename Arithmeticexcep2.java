package exceptionhandling;

public class Arithmeticexcep2 {

	public static void main(String[] args) {
		int a=5;
		int b=2;
		int c=0;
		System.out.println(a);
		try {
			System.out.println(a);
			System.out.println(a/c);
			
			System.out.println(b);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("catch error");
			
		}
		System.out.println(c);

	}

}
