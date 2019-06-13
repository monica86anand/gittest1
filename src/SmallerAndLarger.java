public class SmallerAndLarger
{
	public static void main(String[] args)
	{
		int[] a= {1,2,8,10,11,12,19};
		int key=5;
		int small=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<key)
				small=small+1;
			if(a[i]>key)
			{
				System.out.println("larger"+(a.length-i));
				break;}
		}
		System.out.println(small);
	}
}