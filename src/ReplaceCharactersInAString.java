public class ReplaceCharactersInAString
{
	public static void main(String[] args)
	{
		String str="I lve in blore  ";
		System.out.println(str.trim().replaceAll(" ", "%20"));
	}
}