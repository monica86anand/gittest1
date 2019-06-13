public class StringRotation
{
	public static void main(String[] args)
	{
		String str="amazon";
		if(str.substring(2, str.length()).concat(str.substring(0, 2)).equals("azonam"))
				{
			System.out.println("true");
				}
	}
}