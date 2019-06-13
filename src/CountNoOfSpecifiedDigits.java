
public class CountNoOfSpecifiedDigits
{

public static void main(String[] args)
{
	int j=1;
	int[] a=new int[10];
	int mod=0;
	for(int i=700;i<710;i++)
	{
		j=i;
		while(j/10>0)
		{
			mod=j%10;
			j=j/10;
			a[mod]=a[mod]+1;
		}
		a[j]=a[j]+1;
	}
	System.out.println(a[7]);
}
}