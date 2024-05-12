/*write a java programme to print the day of the week sing switch case statement*/
class Days
{
	public static void main(String args[])
	{
		int day=2;
		switch(day)
		{
			case 1: System.out.println("Monday");
				break;
			case 2: System.out.println("Tuesday");
				break;
			case 3: System.out.println("Wednesday");
				break;
			case 4: System.out.println("Thursday");
				break;
			case 5: System.out.println("Friday");
				break;
			case 6: System.out.println("Saturday");
				break;
			case 7: System.out.println("Sunday");
				break;
				
				default:System.out.println("Invalid Input");
					break;
		}
	}
}