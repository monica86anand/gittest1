public class QuickSort1
{
	public static void main(String[] args)
	{
		int[] a={7,8,9,1,2,-1,-2};
	QuickSort1 qs1=new QuickSort1();
	qs1.sort(a, 0, 6);
	
		for(int i=0;i<a.length;i++)
		{
			
		}
	}
	public int quickSort(int [] a,int beg,int end)
	{
		int loc,flag,right,left,temp; 
		loc=left=beg;
		 right=end;
		
		 flag=0;
		while(flag!=1)
		{
		    while((a[loc] <= a[right]) && (loc!=right))  
		
			right--;
			if(loc==right)
			{
				flag=1;
			}
			else if(a[loc]>a[right])
			{
				temp=a[loc];
				a[loc]=a[right];
				a[right]=temp;
				loc=right;
			}
		if(flag!=1)
		{
			 while((a[loc] >= a[left]) && (loc!=left))
			{
				left++;
			}
			if(left==loc)
				flag=1;
			else if(a[loc]<a[left])
			{
				temp=a[loc];
				a[loc]=a[left];
				a[left]=temp;
				loc=left;
			}
		}
		
	}
		return loc;
	}
	
	public void sort(int[] a, int beg,int end)
	{
		int loc;
		if(beg<end)
		{
			loc=quickSort(a,beg,end);
			sort(a,beg,loc-1);
			sort(a,loc+1,end);
				
		}
	
	}
}