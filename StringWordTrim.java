import java.util.Scanner;
class StringWordTrim
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		String str1 = sc.nextLine();
		str1=str1.trim();
		int len = str1.length();
		int ncount = 0;
		for (int i=0;i<len;i++)
		{
			if(str1.charAt(i)==' ' && str1.charAt(i-1)!=' ')
				ncount = ncount+1;
		}
		System.out.println("No of Words are :"+(ncount+1));
	}
}