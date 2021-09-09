class ConsoleClass
{
	public static void main(String[] args)
	{
		char[] name = System.console().readPassword();  // here the input given will not be seen by us. 
		System.out.println(name);   // here the input given will be printed
	}
}