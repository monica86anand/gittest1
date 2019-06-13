public class LinkedList
{
	public static void main(String[] args)
	{
		Node1 nn=new Node1(85);
		nn.next=new Node1(15);
		nn.next.next=new Node1(5);
		nn.next.next.next=new Node1(20);
		LinkedList l=new LinkedList();
		Node1 n=l.reverse(nn);
		l.printdata(n);
		
		
	}
	
	
	public Node1 reverse(Node1 n)
	{
		Node1 prev=null;
		Node1 current=n;
		Node1 next=null;
		
		
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		n=prev;
		return n;
	}
	
	public void printdata(Node1 n)
	{
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
}


class Node1
{
	Node1 next;
	int data;
	
	
	Node1(int data)
	{
		this.data=data;
		next=null;
	}
}