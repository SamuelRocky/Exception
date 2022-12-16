package exceptionhandling;

public class LogIn {

	public static void main(String[] args) throws LogInException,Exception {
       String userName="Samuel";
       String passWord="Sam@1996";
       try {
       if(userName.equals("Samuel")&& passWord.equals("Sam@1997")) {
    	   System.out.println("valid user");
       }
       else {
    	   throw new LogInException("invalid user");
       }
       }
       catch(LogInException le) {
    	   System.out.println(le);
       }
	}
	

}
