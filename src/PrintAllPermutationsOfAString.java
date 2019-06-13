public class PrintAllPermutationsOfAString
{
	public static void main(String[] args)
	{
		String str="ABC";
		String prefix="";
				
		print(str,prefix);
	}
	
	public static void print(String s,String p)
	{
	if(s.length()==0)
	{
		System.out.println(p);
	}
	else
	{
		for(int i=0;i<s.length();i++)
		{
			String rem=s.substring(0,i)+s.substring(i+1);
			print(rem,p+s.charAt(i));
			
		}
	}
	}
}