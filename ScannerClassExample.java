import java.util.Scanner;
class ScannerClassExample
{
	public static void main(String[] args)
	{
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter Name of the Student, Registration Number, marks of five subjects and calculate total, average and percentage");
		String name = Obj.next();
		int RegNo = Obj.nextInt();
		int x = 0;
		int average = 0;
		int percentage = 0;
		int Total = 0;
		int n = Obj.nextInt();
		for (int i=0; i<n; i++)
		{
			x = Obj.nextInt();
			System.out.println("Marks of"+"Subject No."+(i+1)+": "+x);
			Total = Total+x;
		}
		System.out.println("Name: "+name);
		System.out.println("Registration Number: "+RegNo);
		average = Total/n;
		System.out.println("Average: "+average);
		percentage = (Total*100)/500;
		System.out.println("Percentage: "+percentage+"%");
	}
}