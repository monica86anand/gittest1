package School;
public class SumOfDigitsIsPalindrome
{
public static void main(String[] args)
{
	int i=65;
	int sum=calculateSum(i);
	 int divisor = 1; 
	 int n=1221;
     while (n / divisor >= 10) 
         divisor *= 10; 
}
public static int calculateSum(int i)
{
	int sum=0;
	int mod=0;
	while(i>=10)
	{
		mod=i%10;
		i=i/10;
		sum=sum+mod;
	}
	sum=sum+i;
	System.out.println(sum);
	return sum;
}
public void checkIfSumIsPalindrome(int sum)
{
	int i=0;
while(sum>=10)
{
	
}
}
}