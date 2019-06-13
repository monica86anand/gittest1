import java.util.Scanner;

public class FindMaxAndMinElements
{
	public static void main(String[] args)
	{
		int[] a={67,34,0,69,24,78,58,62,64,5,45,81,27,61,91,95,42,27,36,91,4,2,53,92,82,21,16,18,95,47,26,71,38,69,12,67,99,35,94,3,11,22};
		int j=0;
		Scanner s=new Scanner(System.in);
		while(s.hasNext())
		{
			
		}
		while(s.hasNextInt())
		{
			a[j]=s.nextInt();
			j++;
		}
		int min=a[0];
		int max=a[1];
		for (int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("min"+min);
		System.out.println("max"+max);
	}
}