import java.util.Arrays;
public class Solution {
    
	static int[] b=null;
    public static void main(String[] args)
    {
    
      //  Solution s=new Solution();
    	
    	int a=5989;
    	int mod=0;
    	if(a<100)
    	{
    		b=new int[2];
    	}
    	
    	if(a>100 && a<1000)
    	{
    		b=new int[3];
    	}
    	if(a>=1000 && a<10000)
    	{
    		b=new int[4];
    	}
    	if(a==10000)
    	{
    		System.out.println(a);
    	}
    	int count=0;
   while(a>10)
   {
	   mod=a%10;
	   a=a/10;
	   b[count]=mod;
	count++;   
   }
   b[count]=a;
   Arrays.sort(b);
   for(int k=b.length-1;k>=0;k--)
   {
	   System.out.print(b[k]);
	
   }
   StringBuilder strNum = new StringBuilder();

   for (int num : b) 
   {
        strNum.append(num);
   }
   int finalInt = Integer.parseInt(strNum.toString());
   System.out.println(finalInt);
    }
}