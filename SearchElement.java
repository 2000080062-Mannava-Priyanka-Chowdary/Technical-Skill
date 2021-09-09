class SearchElement
{
	public static void main(String[] args)
	{
		int[] array= {1,4,34,56,7};
		int key = Integer.parseInt(args[0]);
		int a = 0;
		int x=0;
		for (int i=0;i<array.length;i++)
		{
			if (key==array[i])
			{
				x=i+1;
				a = 1;
			}
		}
		if (a==1)
			System.out.println("The Search element position is "+ x);
		else
			System.out.println(-1);
	}
}

