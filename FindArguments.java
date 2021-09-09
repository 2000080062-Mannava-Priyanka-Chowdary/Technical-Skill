class FindArguments
{
	public static void main(String[] args)
	{
		System.out.println("The Number of Arguments are: "+args.length);
		System.out.println("The Arguments are: ");
		for (int i=0;i<args.length;i++)
			System.out.println(i+1 + " " +args[i]);
	}
}
// o/p:-
//The Number of Arguments are: 3
//The Arguments are:
//1 Hi
//2 Sai
//3 Kiran
//if System.out.println(args[i]+ " "+i+1);
//o/p:-
//The Number of Arguments are: 3
//The Arguments are:
//Hi 01
//Sai 11
//Kiran 21 
//it is printed like this because in i+1 plus acts as concatination so orderv is important
//so we have to enclose them within paranthesis  System.out.println(args[i]+ " "+(i+1));