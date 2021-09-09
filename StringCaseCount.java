import java.util.Scanner;
class StringCaseCount
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		String str1 = sc.nextLine();
		int len = str1.length();
		int ncount = 0;
		int lcount = 0;
		int ucount = 0;
		int count =0;
		for (int i=0;i<len;i++)
		{
			if (str1.charAt(i)>='0' && str1.charAt(i)<='9')
				ncount = ncount+1; 
			else if(str1.charAt(i)>='a' && str1.charAt(i)<='z') // here if can also be used
				lcount = lcount+1;
			else if(str1.charAt(i)>='A' && str1.charAt(i)<='Z')//here else if is used to reduce the time complexity if can also be used
				ucount = ucount+1;
			else 
				count = count+1;
		}
		System.out.println("No of Digits are :"+ncount);
		System.out.println("No of LowerCase letters are :"+lcount);
		System.out.println("No of UpperCase letters are :"+ucount);
		System.out.println("No of  are :"+count);// here special symbols and spaces are counted i.e other than the alphabets and numbers
		
	}
}