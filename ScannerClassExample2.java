import java.util.Scanner;
class ScannerClassExample2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int[] primeno = new int[10];
		int count = 0;
		do
		{
			num = myObj.nextInt();
			// here find if the number is prime or not and if it is prime place it in primeno[count]

		}while(num!=-1 || count==10);
	}
}
// prime number condition is math.sqrt(n)
// example is the user gives the numbers if the number is prime 
// then increase the count and if the number is not prime leave it 
// if the user enters -1 stop accepting the input and print the count 
// of the prime numbers and other condition iscount of the prime numbers 
// should not exceed limit 10.