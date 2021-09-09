class StringAlphabet
{
	public static void main(String args[])
	{
		String str = "Farmer jack realized that big yellow quilts were expensive";
		int [] b = new int [26];
		int len = str.length();
		for (int i=0; i<26; i++)
			System.out.print(b[i]+",");
		for (int i=0; i<len; i++)
		{
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z')
			{
				System.out.println((int)(ch-'a')); // here we are refering to the ascii values
				b[(int)(ch-'a')] = 1;  // updating the index // b[(int)(ch-'a')]++ --> this counts the no of occurances of each alphabet
			}
			else if (ch >= 'A' && ch <= 'Z')
			{
				System.out.println((int)(ch-'A'));
				b[(int)(ch-'A')] = 1; // b[(int)(ch-'A')]++ --> this counts the no of occurances of each alphabet
			}
		}
		for (int i=0; i<26; i++)
			System.out.print(b[i]+",");
	}
}
// check if the given string  contains all the alphabets or not
// output is given by the index values for every alphabet in the given string
// (int)(ch-'a') this is the index value
// by the 1's we can know whether all the alphabets are present in the string or not
// println means it prints the output line by line. if you want the output in a straight line just use print
// the order of the output is a,b,c,d,e,......,x,y,z
// First we are initializing the array as 0 and when there us an alphabet we update it to 1 so that we can identify whether all the alphabets are present or not