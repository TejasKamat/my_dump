import java.io.*; 

class Main {
	public static void main(String args[]) {
		int arr[] = new int[10];
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {	
			for(int i = 0; i < arr.length; i++) {
				System.out.print("Enter number at position " + (i+1) + ": ");
				arr[i] = Integer.parseInt(br.readLine());
			}
			System.out.println("You entered numbers are : ");
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("Only even numbers are : ");
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 0) {
					System.out.println(arr[i]);
				}
			}
			System.out.println("Only odd numbers are : ");
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 != 0) {
					System.out.println(arr[i]);
				}
			}
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			System.out.println("The sum is : " + sum);	
		}
		catch(IOException e) {
			System.out.println("tujd");
		}
	}
}