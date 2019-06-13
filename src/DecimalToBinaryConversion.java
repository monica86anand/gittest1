import java.util.Stack;
public class DecimalToBinaryConversion
{
	public static void main(String[] args)
	{
	computeBinary(8);
	}
	
	
	public static void computeBinary(int n)
	{
		Stack st=new Stack();
		while(n!=1)
		{
			st.push(n%2);
			n=n/2;
		}
		st.push(n);
		
		
		while(!st.isEmpty())
			System.out.println(st.pop());
	}
}