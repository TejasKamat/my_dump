class Factorial {
	public void calculateFact(int num) {
		int factorialValue = 1, i = 1;
		
		while(i <= num) {
			factorialValue *=  i;
			i++;
		}
		System.out.println("The Factorial is : " + factorialValue);
	}
	public void printNum(int start, int end) {
		for(; start <= end ; start++) {
			if (start > 200) {
				break;
			}
			if(start == 68) {
				continue;
			}
			System.out.println("Number : " + start);
		}
	}

	public static void main(String args[]) {
		Factorial f = new Factorial();
		f.calculateFact(3);	
		f.printNum(10, 20);
	}
}






























