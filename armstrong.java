class armstrong
{
	public static void main (String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int sum=0;
		int x;
		int num;
		num=a;
		while(a!=0)
		{
			x=a%10;
			sum=sum+(x*x*x);
			a= a/10;
		}
		System.out.println(sum);
		if(num==sum)
			System.out.println("It is an armstrong number");
		else
			System.out.println("It is not an armstrong number");
	}
}
