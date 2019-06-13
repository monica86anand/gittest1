import java.util.Arrays;
public class PrintLeftElement
{
	public static void main(String[] args)
	{
		int[] a={8,1,2,9,4,3,7,5};
		Arrays.sort(a);
		if(a.length%2!=0)
		{
		System.out.println("Left over element is "+a[a.length/2]);
		}
		else
		{
			System.out.println(a[a.length/2-1]);
		}
	}
}