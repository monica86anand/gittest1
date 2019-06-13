package School;
public class IdentifyCamelCaseLetters
{
	public static void main(String[] args)
	{
		String s="njnnk";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90)
			{
				count++;
			}
		}
		System.out.println(count);
	
	}
}