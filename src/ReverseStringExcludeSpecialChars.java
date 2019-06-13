public class ReverseStringExcludeSpecialChars
{
	public static void main(String[] args)
	{
		String s=",ab!cd";
		char[] c=s.toCharArray();
		int start=0;
		int end=s.length()-1;
		char temp=0;
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isAlphabetic(s.charAt(i)))
			{
				start=i+1;

			}
			if(Character.isAlphabetic(s.charAt(i)) && start<end)
					{
               temp=c[start];
				c[start]=c[end];
				c[end]=temp;
				
				start++;
				end--;
					}
		}
	}
}
