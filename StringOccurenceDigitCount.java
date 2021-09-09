import java.util.Scanner;
class StringOccurenceDigitCount
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		String str1 = sc.nextLine();
		int len = str1.length();
		int ncount = 0;
		for (int i=0;i<len;i++)
		{
			if(str1.charAt(i)>='0' && str1.charAt(i)<='9')
				ncount = ncount+1;
		}
		System.out.println("No of Digits are :"+ncount);
	}
}
// find the count of the occurences of each digits
