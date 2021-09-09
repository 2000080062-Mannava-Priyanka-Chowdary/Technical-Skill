import java.util.Scanner;
class StringCharCountByIndexOf
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		String str1 = sc.nextLine();
		char ch = sc.next().charAt(0);
		if (str1.indexOf(ch)==-1)
			System.out.println("Character is not found");
		else if (str1.indexOf(ch,str1.indexOf(ch)+1)==-1)
			System.out.println("Character occured only once at"+str1.indexOf(ch));
		else
			System.out.println("Character occured more than once at "+str1.indexOf(ch)+" and also at "+(str1.indexOf(ch,str1.indexOf(ch)+1)));
	}
}
// occurance of the character using indexOf
// let the input be sai kiran
// str1.indexOf(ch) gives the position of the character
// this can only read two occurances of a character
// str1.indexOf(ch)+1, here +1 should be kept because if it is not kept  it also reads the character present there so the output gets affected
// str.indexOf('a',2), here 2 is the position, it starts to check from that particular position