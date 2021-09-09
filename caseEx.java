class caseEx
{
	public static void main (String[] args)
	{
		char gender;
		gender = args[0].charAt(0);
		switch(gender)
		{
			case 'm':
				System.out.println("Male");
				break;
			case 'f':
				System.out.println("Female");
				break;
			case 'o':
				System.out.println("Others");
				break;
			default:
				System.out.println("Invalid Input");
				break;
		}
	}
}