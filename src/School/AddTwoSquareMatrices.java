package School;
public class AddTwoSquareMatrices
{
public static void main(String[] args)
{
	int[][] a={{1,2},{3,4}};
	int[][]b={{3,4},{2,1}};
	int[][]c=new int[a.length][a.length];
	int m=0;
	int n=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			c[m][n]=a[i][j]+b[i][j];
			System.out.println(a[i][j]);
			System.out.println(b[i][j]);
			n++;
		}
		m++;
		n=0;
	}
}
}
