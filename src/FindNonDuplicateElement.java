public class FindNonDuplicateElement
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,1,2};
		int xor=0;
		for(int i=0;i<a.length;i++)
		{
			xor=xor^a[i];
		}
		System.out.println(xor);
	}
}