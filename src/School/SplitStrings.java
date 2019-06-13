package School;
public class SplitStrings
{
	public static void main(String[] args)
	{
		String s="geeks01for02geeks03!!!";
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		StringBuffer sb3=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i))||Character.isDigit(s.charAt(i)))
			{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				sb1.append(s.charAt(i));
			}
			if(Character.isDigit(s.charAt(i)))
			{
				sb2.append(s.charAt(i));
			}
			}
			else
			{
				sb3.append(s.charAt(i));
			}
		}
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
	}
}