import java.util.Scanner;
class StringIndexOfExample
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if (str1.indexOf(str2)==-1)
			System.out.println("Substring not found");
		else
			System.out.println("Found at index position: "+str1.indexOf(str2));
	}
}
// here we have to give a string and in the 2nd line we have to give a word from the given 1st string
// the output will retuen the position
// if the 2nd line word is not in the 1st line string it returns -1