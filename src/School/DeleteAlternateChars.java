
package School;
public class DeleteAlternateChars
{
public static void main(String[] args)
{
	String s="GeeksforGeeks";
	char[]c=s.toCharArray();
	s="";
	for(int i=0;i<c.length;i++)
	{
		if(i%2==0)
		{
			s=s.concat(""+c[i]);			
			
		}
	}
	System.out.println(s);
}
}