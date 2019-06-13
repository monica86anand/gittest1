package School;
public class PatternOfStrings
{
public static void main(String[] args)
{
	String s="th%ik";
	for(int i=s.length();i>=0;i--)
	{
		System.out.println(s.substring(0,i));
	}
}
}