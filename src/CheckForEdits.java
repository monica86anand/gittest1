import java.util.HashSet;
import java.util.Set;

public class CheckForEdits
{
	public static void main(String[] args)
	{
		String s1="pale";
		String s2="pale";
		
		boolean flag=	checkString(s1,s2);
		System.out.println(flag);
	
	}
	
	public static boolean checkString(String s1,String s2)
	
	{
		int count=0;
		boolean flag=false;
		Set<Character> s=new HashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			s.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++)
		{
			 flag=s.add(s2.charAt(i));
			if(flag==true)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("zero edit");
			
		}
		if(count==1)
		{
			System.out.println("single edit");
			return true;
		}
		if(count>1)
		{
			return false;
		}
		
		return true;
	}
}