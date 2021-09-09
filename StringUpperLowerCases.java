import java.util.Scanner;
class StringUpperLowerCases
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str1= sc.nextLine();
		System.out.println("Upper Case : "+str1.toUpperCase()); //here the original value will not be changed
		System.out.println("Lower Case : "+str1.toLowerCase());
		System.out.println("Original: "+str1);
	}
}
// if we want to update the original value use str1 = str1.toUpperCase()
// here the original value will be changed
// use String str2 = str1.toUpperCase()to store the value in other variable