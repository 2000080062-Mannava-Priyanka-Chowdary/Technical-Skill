import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExampleOfBufferedReaderClass
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		int num2 = Integer.parseInt(reader.readLine());
		System.out.println(num + num2);
	}
}