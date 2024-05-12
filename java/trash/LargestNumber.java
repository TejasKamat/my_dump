import java.io.*;

class LargestNumber {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str1 = br.readLine();
			int a = Integer.parseInt(str1);

			int b = Integer.parseInt(br.readLine());
			System.out.println(b);
			if(a > b) {
				System.out.println("A is greater than B");
			} else if(b > a) {
				System.out.println("B is greater than A");
			} else {
				System.out.println("Both the numbers are equal ! ");
			}
		}
		catch(IOException e) {
			System.out.println("Error reading input. Please enter valid numbers.");
		}
	}
}

/*A is greater than B");
		} else if(b>a) {
			System.out.println("B is greater than A");
		} else {
			System.out.println("A and B is equal");
		}
*/