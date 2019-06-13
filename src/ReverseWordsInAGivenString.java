public class ReverseWordsInAGivenString
{
	public static void main(String[] args)
	{
		String[] s=" geeks  quiz  practice code ".split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
	}
}