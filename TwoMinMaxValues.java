// Initialise the integer array with values and find 2 max and 2 min values in the array
class TwoMinMaxValues
{
	public static void main(String[] args)
	{
		int[] a = {3,2,6,4,9};
		int max1=0;
		int max2=0;
		int min1=20; // here we cannot initialize min with 0 because the o/p will be 0 since it is the least value so we have to give the value which is greater than the values we have given in the array
		int min2=20;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if (max2<a[i] && max2<max1)
				max2=a[i];
			if (min1>a[i])
			{
				min2=min1;
				min1=a[i];
			}
			else if (min2>a[i] && min2>min1)
				min2=a[i];
		}
		System.out.println("The 1st Maximum value in the array is "+ max1);
		System.out.println("The 2nd Maximum value in the array is "+ max2);
		System.out.println("The 1st Minimum value in the array is "+ min1);
		System.out.println("The 2nd Minimum value in the array is "+ min2);
	}
}
//o/p:-
//The 1st Maximum value in the array is 9
//The 2nd Maximum value in the array is 6
//The 1st Minimum value in the array is 2
//The 2nd Minimum value in the array is 3




// method said by HOD sir to find max and min value of the given array :-
//int[] array=new int[10];
//int len=args.length;
//int sum=0;
//int max=Integer.MIN_VALUE;
//int min=Integer.MAX_VALUE;
//for (int i=0;i<len;i++)
//	array[i]=Integer.parseInt(args[i]);
//	sum=sum+array[i];
//	if(max<array[i])
//	 max=array[i];
//	if(min>array[i])
//	 min=array[i];
//print(sum)
//print(max)
//print(min)



//method said by HOD sir to find 2 max and 2 min value of the given array :-
//int[] array=new int[10];
//int len=args.length;
//int sum=0;
//int max=Integer.MIN_VALUE;
//int secondmax=Integer.MIN_VALUE;
//int min=Integer.MAX_VALUE;
//int secondmin=Integer.MAX_VALUE;
//for (int i=0;i<len;i++)
//	array[i]=Integer.parseInt(args[i]);
//	sum=sum+array[i];
//	if(max<array[i])
//	 max=array[i];
//	if(secondmax<array[i] && array[i]!=min)
//	 secondmax=array[i];
//	if(min>array[i])
//	 min=array[i];
//	if(secondmin>array[i] && array[i]!=max)
//	 secondmin=array[i];
//print(max)
//print(secondmax)
//print(min)
//print(secondmin)