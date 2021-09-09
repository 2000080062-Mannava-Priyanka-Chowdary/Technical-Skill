import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderClassExample2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String name = reader.readLine();
		System.out.println("Enter the student marks in sub 1: ");
		float m1 = Float.parseFloat(reader.readLine());
		System.out.println("Enter the student marks in sub 2: ");
		float m2 = Float.parseFloat(reader.readLine());
		System.out.println("Enter the student marks in sub 3: ");
		float m3 = Float.parseFloat(reader.readLine());
		System.out.println("Total marks of "+name+" is "+(m1+m2+m3));
		System.out.println("Average marks of "+name+" is "+(m1+m2+m3)/3);
	}
}