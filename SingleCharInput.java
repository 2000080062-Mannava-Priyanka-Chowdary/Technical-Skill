import java.util.Scanner;
class SingleCharInput
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		char ch;
		ch = sc.next().charAt(0);
		System.out.println(ch);
	}
}