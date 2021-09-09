import java.util.Scanner;
class StringSpaceCount
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		String str1 = sc.nextLine();
		int len = str1.length();
		int count = 0;
		for (int i=0;i<len;i++)
		{
			if(str1.charAt(i)==' ') // we can also use \s to identify the space
				count++ ;
		}
		System.out.println("No of Spaces are :"+count);
	}
}