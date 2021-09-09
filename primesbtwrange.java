class primesbtwrange
{
	public static void main(String args[])
	{
		int m=Integer.parseInt(args[0]);
		int n=Integer.parseInt(args[1]);
		int num=0;
		int i;
		String Primenumbers = " ";
		for(i=m;i<=n;i++)
		{
			int count=0;
			for(num=i;num>=1;num--)
			{
			   if(i%num==0)
			       count++;
			}
			if(count==2)
			{
		  		Primenumbers = Primenumbers + i + " ";
			}
		}
		System.out.println("Prime numbers between given range are:");
		System.out.println(Primenumbers);
	}
}
// take 10 and 99