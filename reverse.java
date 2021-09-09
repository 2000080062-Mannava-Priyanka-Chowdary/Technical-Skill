class reverse
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int reverse=0;
		int n;
		while(a!=0)
		{
			n=a%10;
			reverse=(reverse*10)+n;
			a=a/10;
		}
		System.out.println(reverse);
	}
}