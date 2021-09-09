import java.util.Scanner;
class StringIndexOf
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		String str1 = sc.nextLine();
		char ch = sc.next().charAt(0);
		System.out.println(str1.indexOf(ch));
	}
}
// third line takes the character as a input so that it checks the index of that particular character
// Input:-     Priya
//	    r
//  output:-    1