package Interview;

import java.util.Arrays;
import java.util.Collections;

public class Test
{
	public static void main(String[] args)
	{
		String s="abac";
		int k=4;
		char[]c=s.toCharArray();
		int[]j=new int[c.length];
		Arrays.sort(c);
		//System.out.println(c);
		int count=1;
		int m=0;
		for(int i=0;i<c.length;i++)
		{
			if(i+1<c.length)
			{
				if( c[i]==c[i+1])
				count=count+1;
				else
				{
					
					j[m]=count;
					count=1;
					m++;
					
				}
			}
		}
		j[m]=count;
		//System.out.println(j);
		int index=0;
		for(int i=0;i<j.length;i++)
		{
			if(j[i]-k==0)
			{
				k=j[i]-k;
				j[i]=0;
				
				if(k==0)
				{
				index=i;
				break;
				}
			}
			else if	(j[i]-k>0)
			{
				j[i]=j[i]-k;
				index=i;
				break;
			}
			else
			{
				k=k-j[i];
				j[i]=0;
				continue;
			}
			
		}
		int sum=0;
		for(int i=index;i<j.length;i++)
		{
			sum=sum+j[i]*j[i];
		
			
		}
		System.out.println(sum);
		
	}
}