class MergeLists
{
	public static void main(String[] args)
	{
		MergeLists m=new MergeLists();
		Node n=m.addToLast(5);
		n.next=m.addToLast(9);
	n.next.next=m.addToLast(14);
		Node n2=m.addToLast(6);
		n2.next=m.addToLast(10);
		
		
		merge(n, n2);
		
	}
	
	public static Node addToLast(int k)
	{
		Node n1=new Node();
		n1.data=k;
		n1.next=null;
		return n1;
	}
	
	
	public static Node merge(Node n,Node n2)
	{
		if(n==null)
		{
			return n2;
		}
		if(n2==null)
		{
			return n;
		}
		if(n.data<n2.data)
			
		{
			return mergeUtil(n,n2);
		}
		
		else
		{
			return mergeUtil(n2,n);
		}
	}
	
	
	
	public static Node mergeUtil(Node n, Node n2)
	{
		if(n.next==null)
		{
			n.next=n2;
			return n;
		}
		
		 // Initialize current and next pointers of  
	    // both lists  
	    Node curr1 = n, next1 = n.next;  
	    Node curr2 = n2, next2 = n2.next;  
	  
	    while (next1 != null && next2 != null)  
	    {  
	        // if curr2 lies in between curr1 and next1  
	        // then do curr1->curr2->next1  
	        if ((curr2.data) > (curr1.data) &&  
	            (curr2.data) < (next1.data))  
	        {  
	            next2 = curr2.next;  
	            curr1.next = curr2;  
	            curr2.next = next1;  
	  
	            // now let curr1 and curr2 to point  
	            // to their immediate next pointers  
	            curr1 = curr2;  
	            curr2 = next2;  
	        }  
	        else
	        {  
	            // if more nodes in first list  
	            if (next1.next != null)  
	            {  
	                next1 = next1.next;  
	                curr1 = curr1.next;  
	            }  
	  
	            // else point the last node of first list  
	            // to the remaining nodes of second list  
	            else
	            {  
	                next1.next = curr2;  
	                return n;  
	            }  
	        }  
	    }  
	    return n;  
	}  
}

class Node
{
	int data;
	Node next;
	
	
	Node()
	{
		
	}
	
	
}