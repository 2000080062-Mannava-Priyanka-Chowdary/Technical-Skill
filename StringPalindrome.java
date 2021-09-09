import java.util.Scanner;
class StringPalindrome
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		String str1 = sc.nextLine();
		int len = str1.length();
		str1 = str1.toLowerCase(); // here we are converting all the letters to lower case
		int flag =0;
		for (int i=0;i<len/2;i++)//here we check the palindrome so half length is enough
		{
			if (str1.charAt(i) != str1.charAt(len-1)-i)
			{
				flag=1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is not a Palindrome");
	}
}
// check the given string is palindrome or not
// take input either in lower case or upper case so that the program can be simple
// len-1 last index position
// for example if the input is given as Sas actually it is a palindrome but since  java is a case sensitive
// it gives output that it is not a palindrome so we have to convert them into lower case