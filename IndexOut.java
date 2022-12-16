package exceptionhandling;

public class IndexOut {

	public static void main(String[] args) {
		String a="samuel";
		String b=null;
		try {
			System.out.println(b);
			System.out.println(a.charAt(6));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Run code");
		}
       
	}

}
