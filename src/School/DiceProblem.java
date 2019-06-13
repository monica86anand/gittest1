package School;

import java.util.Scanner;

public class DiceProblem
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		System.out.println(i);
		int noOnOppositeSide=7-i;
		System.out.println(noOnOppositeSide);
	}
}