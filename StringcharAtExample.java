import java.util.Scanner;
class StringcharAtExample
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		String str1 = sc.nextLine();
		int len = str1.length();
		System.out.println(str1.charAt(0)); // prints first character
		System.out.println(str1.charAt(len/2)); //// prints middle character according to the given input
		System.out.println(str1.charAt(len-1)); // prints last character
	}
}