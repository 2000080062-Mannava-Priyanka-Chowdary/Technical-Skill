// Initialise the integer array with values and find max and min values in the array
class MinMax
{
	public static void main(String[] args)
	{
		int[] a = {3,2,6,4,9};
		int max=0;
		int min=20; // here we cannot initialize min with 0 because the o/p will be 0 since it is the least value so we have to give the value which is greater than the values we have given in the array
		for (int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("The Maximum value in the array is "+ max);
		System.out.println("The Minimum value in the array is "+ min);
	}
}
// o/p:-
//The Maximum value in the array is 9
//The Minimum value in the array is 2
