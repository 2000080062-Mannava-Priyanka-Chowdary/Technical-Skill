import java.io.BufferedReader;
import java.io.IOException;       // Here instead of these three imports we can use import java.io.*; because it reads all the packages present in java.io so we need not import them seperately
import java.io.InputStreamReader;
public class BufferedReaderClass
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		System.out.println(name);
	}
}