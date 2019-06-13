public class StringCompression
{
	public static void main(String[] args)
	{
		String s1="ABBBBCDDDDDD";
		StringBuffer s2=new StringBuffer();
		int count=1;
		int lenght=0;
		for(int i=0;i<s1.length();i++)
		{
			if(i+1<s1.length() && s1.charAt(i)==s1.charAt(i+1))
			{
				count=count+1;
				continue;
			}
			else
			{
				
				s2.append(s1.charAt(i)).append(count);
				count=1;
			}
		}
		System.out.println(s2);
		if(s2.length()>=s1.length())
		{
			System.out.println(s1);
		}
		else
		{
			System.out.println(s2);
		}
		
		
		
	}
}