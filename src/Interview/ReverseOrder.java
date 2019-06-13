package Interview ;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ReverseOrder
{
	public static void main(String[] args)
	{
		  // create linked list object
	      LinkedList<Integer> list = new LinkedList<Integer>();

	      // populate the list
	      list.add(-28);
	      list.add(20);
	      list.add(-12);
	      list.add(8);

	      // create comparator for reverse order
	      Comparator<Integer> cmp = Collections.reverseOrder();

	      // sort the list
	      Collections.sort(list, cmp);  

	      System.out.println("List sorted in ReverseOrder: ");
	      for(int i : list) {
	         System.out.println(i+ " ");
	      }	
	}
}