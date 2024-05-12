import java.io.*;

public class Execute {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter First Name: ");
			String firstName = br.readLine();

			System.out.print("Enter Last Name: ");
			String lastName = br.readLine();

			String fullName = firstName + " " + lastName;
	            		System.out.println("Full Name: " + fullName);

			String upperCaseFirstName = firstName.toUpperCase();
			System.out.println("Uppercase First Name: " + upperCaseFirstName);

			int lastNameLength = lastName.length();
			System.out.println("Length of Last Name is : " + lastNameLength);

			System.out.print("Enter the starting index for substring in First Name: ");
		
			int startIndex = Integer.parseInt(br.readLine());
			String substringFirstName = firstName.substring(startIndex);
		
			System.out.println("Substring from First Name: " + substringFirstName);
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}