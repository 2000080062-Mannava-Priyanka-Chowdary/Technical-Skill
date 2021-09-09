import java.util.Scanner;
class EvenOddSubString
{
	public static void main(String args[])
        	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		if (str1.length()%2==0)
			System.out.println(str1.substring(0,str1.length()/2));
		else
			System.out.println(str1.substring(str1.length()/2+1,str1.length()));
        	}
}
