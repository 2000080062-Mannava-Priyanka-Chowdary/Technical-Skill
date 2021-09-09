class ifelse
{
	public static void main(String[] args)
	{
		char gender=args[0].charAt(0);
		int age=Integer.parseInt(args[1]);
		if (gender=='f' && age>=1 && age<=58)
			System.out.println("Intrest = 8.2%");
		else if (gender=='f' && age>=59 && age<=120)
			System.out.println("Intrest = 7.6%");
		else if (gender=='m' && age>=1 && age<=60)
			System.out.println("Intrest = 9.2%");
		else if (gender=='m' && age>=61 && age<=120)
			System.out.println("Intrest = 8.3%");
		else
			System.out.println("Wrong Option");
	}
}

// Take input as male 25