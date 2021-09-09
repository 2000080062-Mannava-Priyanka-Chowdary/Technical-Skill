class whileloop
{
	public static void main (String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int sum=0;
		int x;
		while(a!=0)
		{
			x=a%10;
			sum=sum+x;
			a= a/10;
		}
		System.out.println(sum);
	}
}
