import java.util.Scanner;
public class TestScanner
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		while(s1.hasNext()!=false)
		{
			if(s1.hasNextBoolean())
			{
				System.out.print(s1.nextBoolean());
				System.out.print("boolean");
			}
			else if (s1.hasNextInt())
			{
				System.out.println(s1.nextInt());
				
			}
		}
	}
}