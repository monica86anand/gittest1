
import java.util.ArrayList;
import java.util.List; 
public class ReverseVowels
{
public static void main(String[] args)
{
	String str="ransomware";
	StringBuffer sb=new StringBuffer();
	List l1=new ArrayList();
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		{
			l1.add(i);
		}
	}
	int size=l1.size()-1;
	for(int i=0;i<str.length();i++)
		
	{
		
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		{
			sb.append(str.charAt((int)l1.get(size)));
			size=size-1;
		}
		else
		{
			sb.append(str.charAt(i));
		}
		
	}
	System.out.println(sb);
}
}
