package School;
public class CheckIfAGivenNoHasOnlyOneBitSet
{
	public static void main(String[] args)
	{
		int i=7;
	
		if((i & (i-1))>0)
		{
			System.out.println("number has more than one bit set");
		}
	}
}