package exceptionhandling;

public class AgeEligibility {

	public static void main(String[] args) throws AgeException,Exception {
        int age=16;
        try {
        if(age>18) {
        	System.out.println("eligible to vote");
        }
        else {
        	throw new AgeException("not eligible");
        }
        }
        catch(AgeException ae)
        {
        	System.out.println(ae);
        	ae.printStackTrace();
        }
        System.out.println("run code");
	}

}
