import java.util.Scanner;
class Strings
{
	public static void main(String args[])
	{
		String str1 = "Direct Assignment";
		char[] ch = {'c','h','a','r','A','R','R','A','Y'};
		String str2 = new String (ch); // it creates a variable for a particular value
		String str3 = new String ("Through Object"); // here it creates an object for particular class
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		Scanner sc = new Scanner (System.in); //Takes the input
		String str = sc.nextLine();
		System.out.println(str);
	}
}
// object takes more space and variable takes less space
// but the output is the same
// object contains space for variable, float,stack,...... so on
// char[] ch = {'c','h','a','r','A','R','R','A','Y'}; it is a character array
// after adding the line String str2 = new String (ch); it is no more character array but a single string
// Ways of taking a string
// String s1 = "HELLO"
// String s2 = "HELLO"                              3e25ae     3e25ae
// here memory allocation is taken as           HELLO
//                                                                              s1                s2
// since the value is same so the allocation is taken in the same  memory  location
// String s1 = new String ("HELLO")
// String s1 = new String ("HELLO")             3e25ad                       3e25ae
// here memory allocation is taken as          HELLO                       HELLO
//				s1                                   s2
// the memory allocation taken in different locations