public class SearchAnElement
{
	public static void main(String[] args)
	{
		int[] a={1, 0, -1,-2,-1,0,1,2,3}   ;
		int el=3;
		int diff =Math.abs(a[0]-el);
		for(int i=diff;i<a.length;i++)
		{
			if(a[i]==el)
				
			{
				System.out.println("element is at position "+i);
				break;
			}
		}
		
		
	}
}