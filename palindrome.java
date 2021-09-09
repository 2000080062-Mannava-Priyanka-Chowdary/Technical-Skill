class palindrome
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int reverse=0;
		int n;
		int num;
		num=a;
		while(a!=0)
		{
			n=a%10;
			reverse=(reverse*10)+n;
			a=a/10;
		}
	if(num==reverse)
		System.out.println("The given number is a Palindrome");
	else
		System.out.println("The given number is not a Palindrome");
	}
}