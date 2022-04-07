   package validate;
		import java.util.ArrayList;
		import java.util.List;
		import java.util.Scanner;
		import java.util.regex.Matcher;
		import java.util.regex.Pattern;
		public class EmailValidation {
		 public static boolean isValidEmail(String email) {
		 String regex = "^(.+)@(.+)$";
		 
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(email);
		 return matcher.matches();

		 }
		 public static void main(String[] args) {
		 List<String> emails = new ArrayList<String>();
		 //valid email
		 emails.add("prachi.gururani@example.com");
		 emails.add("deepali.gaira123p@example.com");
		 emails.add("sn.17cs3example.me.org");
		 
		 //invalid email
		 emails.add("abc-@example.com");
		 emails.add("abc..def@example.com");
		 emails.add("abc#def@.example.com");
		 for (String value : emails) {
		 System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" :
		"invalid"));
		 }

		 System.out.println("Enter any email address to check");
		 Scanner s = new Scanner(System.in);
		 String input = s.nextLine();
		 System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" :
		"invalid"));

		 }

		}
