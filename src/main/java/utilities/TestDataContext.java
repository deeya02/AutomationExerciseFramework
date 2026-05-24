package utilities;

public class TestDataContext {
	private static final ThreadLocal<String> email = new ThreadLocal<>();
			 public static void setEmail(String value) 
			 { 
				 email.set(value); 
				 }
			 public static String getEmail() { 
				 return email.get();
				 }
			 public static void clear() { 
				 email.remove(); 
				 }

}
