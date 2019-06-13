package School;
public class FloydsTriangle
{
public static void main(String[] args)
{
int k=1;
	for(int i=1;i<16;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(k);
			System.out.print(" ");
			k++;
		}
		
	}
}
}