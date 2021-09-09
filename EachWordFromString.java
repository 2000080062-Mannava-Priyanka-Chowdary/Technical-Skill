import java.util.Scanner;
class EachWordFromString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String st1 = sc.nextLine();
		int len = st1.length();
		int ipos = 0;
		int npos = st1.indexOf(' ');
		if (npos == -1)
			System.out.println(st1);
		else
		{
			do
			{
				System.out.println(st1.substring(ipos,npos));
				ipos = npos+1;
				npos = st1.indexOf(' ',npos+1);
			}while(npos!=-1);
		}
		System.out.println(st1.substring(ipos,len));
	}
}
// drawback of this program is it treats each space as a seperate word
// use the trim logic to avoid that