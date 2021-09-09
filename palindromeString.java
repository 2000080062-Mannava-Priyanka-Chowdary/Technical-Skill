class palindromeString
{
	public static void main(String args[])
	{
		String n = new String ("syy"); // EX-2 :- sys is a palindrome
		int flag = 0;
		int x = n.length();
		for (int i=0;i<x;i++)
		{
			if(n.charAt(i) == n.charAt(x-(i+1)))
				flag = 1;
			else
				flag = 0;
				break;
		}
		if (flag == 1)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
	}
}
// check if the given string  is palindrome or not
