import java.util.ArrayList;
import java.util.List;

public class PositionOfRightmostSetBit
{
	public static void main(String[] args)
	{
		int i=19 ;
		int count=0;
		while(i/2>0)
		{
			
			count=count+1;
			if(i%2==1)
			{
				break;
			}
			i=i/2;
		}
		System.out.println(count);
		List l=new ArrayList();
		l.add(1);
		System.out.println(l.indexOf(arg0));
	}
}