package School;
public class FindDifferenceBetweenSumOfTwoDiagonals
{
	public static void main(String[] args)
	{
		int n=0;
		int m=2;
		int []a[]=new int[3][3];
		a[0][0]=11;
		a[0][1]=2;
		a[0][2]=4;
		///
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		//
		a[2][0]=10;
		a[2][1]=8;
		a[2][2]=-12;
		int psum=0;
		int ssum=0;
		for(int i=0;i<3;i++)
		{
			psum=psum+a[i][n];
			ssum=ssum+a[i][m];
			n++;
			m--;
			
		}
		System.out.println(psum);
		System.out.println(ssum);
		
		
	}
}