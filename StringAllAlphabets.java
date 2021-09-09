import java.util.Scanner;
class StringAllAlphabets
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		String str1 = sc.nextLine();
		int len = str1.length();
		int flag = 0;
		for (int i=0;i<len;i++)
		{
			if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
				flag=1;
			else if(str1.charAt(i)>='A' && str1.charAt(i)<='Z')
				flag=1;
			else
				flag=0;
		}
		if (flag==0)
			System.out.println("All Alphabets are present");
		else
			System.out.println("All Alphabets are not present");
	}
}
// input:-  Farmer jack realized that big yellow quilts were expensive