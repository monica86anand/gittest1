public class ChangeTheString
{
	public static void main(String[] args)
	{
		String s="geEkS";
		if((int)s.charAt(0)>=65 && (int)s.charAt(0)<=90)
		{
			System.out.println(s.toUpperCase());
		}
		else if((int)s.charAt(0)>=97 && (int)s.charAt(0)<=122)
		{
			System.out.println(s.toLowerCase());
		}
	}
}