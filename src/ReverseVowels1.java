public class ReverseVowels1
{
	public static void main(String[] args)
	{
		String str="ransomware";
		char[] c=str.toCharArray();
		int i=0;
		int j=str.length()-1;
		String s="";
		char temp;
		while(i<=str.length()-1 && j>=0 && j>i)
		{
			if(str.charAt(i)!='a' || str.charAt(i)!='e' || str.charAt(i)!='i' || str.charAt(i)!='o' || str.charAt(i)!='u' )
			{
				c[i]=str.charAt(i);
				i++;
			}
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
			{
				if(str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(i)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u' )
				{
					temp=str.charAt(i);
					c[i]=c[j];
					c[j]=temp;
					
				}
			}
		}
	}
}