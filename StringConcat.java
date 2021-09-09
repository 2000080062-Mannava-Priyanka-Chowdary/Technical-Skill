class StringConcat
{
	public static void main(String args[])
	{
		String str1 = "Direct Assignment";
		String str2 = "Direct Assignment";
		String str3 = new String ("Direct Assignment");
		String str4 = new String ("Direct Assignment");
		str1 = str1 + str2;
		str3 = str3.concat(str4);
		System.out.println(str1);
		System.out.println(str3);
	}
}
// it does not update s1 or s2 i.e original value