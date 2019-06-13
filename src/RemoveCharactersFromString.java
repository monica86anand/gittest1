public class RemoveCharactersFromString
{
	public static void main(String[] args)
	{
		String s="AA123BB4";
		char[] c=s.toCharArray();
		s="";
		for(int i=0;i<c.length;i++)
		{
			if(!Character.isAlphabetic(c[i]))
			{
				s=s+c[i];
			}
		}
		System.out.println(s);
	}
}