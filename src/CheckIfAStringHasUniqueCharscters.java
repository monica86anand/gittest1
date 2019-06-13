import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CheckIfAStringHasUniqueCharscters
{
	public static void main(String[] args)
	{
		String s="abcd10jk";
		Arrays.sort(s.toCharArray());
		char[] c=s.toCharArray();
		
		Arrays.sort(c);
		for(int i=0;i<s.toCharArray().length;i++)
		{
			if( i+1<c.length && c[i]==c[i+1])
			{
				System.out.println("contains duplicate char");
				break;
			}
		}
		/**Ineffiencent
		for(int i=0;i<s.length();i++)
		{
			
		if(i==0)
			{
				if(s.substring(i+1, s.length()).contains(""+s.charAt(i)))
				{
					System.out.println("string does not have unique char");
					break;
				}
			}
			else if(i==s.length()-1)
			{
				if(s.substring(0, i).contains(""+s.charAt(i)))
				{
					System.out.println("string does not have unique char");
					break;
				}
			}
			else if(i>0 )
			{
				if(s.substring(i+1, s.length()).contains(""+s.charAt(i)) || s.substring(0, i).contains(""+s.charAt(i)))
				{
					System.out.println("string does not have unique char");
					break;
				}
			}
		}**/
	
	}
}