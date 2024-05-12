class NumberSorting
{
	public static void main(String args[])
	{
		int number[]={50,80,40,65,71};
		int n=number.length;
		System.out.println("Given list is:");
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Element no"+i+"is"+number[i]);
		}
		System.out.println("\n");
	
	
//Sorting begins

	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if (number[i]<number[j])
			{
				int temp=number[i];
				number [i]=number[j];
				number [j]=temp;
			}
		}
		
	}
System.out.println("Sorted list is:");
		for(int i=0;i<n;i++)
		{
			System.out.println("element no"+i+"is"+number[i]);
		}
	System.out.println("\n");
}
}
