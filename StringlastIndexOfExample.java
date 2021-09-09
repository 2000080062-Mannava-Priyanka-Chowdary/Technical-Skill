import java.util.Scanner;
class StringlastIndexOfExample
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		String str1 = sc.nextLine();
		char ch = sc.next().charAt(0);
		if (str1.indexOf(ch)==-1)
			System.out.println("Character is not found");
		else if (str1.indexOf(ch)==str1.lastIndexOf(ch))
			System.out.println("Character occured only once at"+str1.indexOf(ch));
		else
			System.out.println("Character occured more than once at "+str1.indexOf(ch)+" and last at "+str1.lastIndexOf(ch));
	}
}