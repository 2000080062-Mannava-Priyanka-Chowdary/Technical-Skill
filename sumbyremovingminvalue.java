class sumbyremovingminvalue
{
	public static void main(String[] args)
	{
		int[] array=new int[10];
		int len=args.length;
		int sum=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i=0;i<len;i++)
		{
			array[i]=Integer.parseInt(args[i]);
			sum=sum+array[i];
			if(min>array[i])
		 	min=array[i];
		}
		System.out.println((sum-min));
	}
}