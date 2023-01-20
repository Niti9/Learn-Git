import  java.lang.*;
import  java.util.*;
import java.util.Scanner;

 class SingleList
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;

	public void creation()
		{
			 int data , n;
			Scanner sc = new Scanner(System.in);
			do
			{
				System.out.print("Enter value: " );
				data = sc.nextInt();	
				Node new_node = new Node(data);
				if(head ==null)
				{
					head = new_node;
				}
				else 
				{
					new_node.next = head;
					head = new_node;				
				}
				System.out.println("Enter 1 for add another value or press anyother value  for submit: ");
				n = sc.nextInt();
				}
				while(n == 1);
}	
public void traversed()
				{
					Node temp = head;
					 if(head == null)
						{
							System.out.println("LinkedList not exist");
						}
					else
						{
							while(temp!=null)
								{	
									System.out.println(temp.data);
									temp = temp.next;							
								}
						}
					}										
	
public static void main(String []args)
{
				SingleList list= new SingleList();
				list.creation();
				list.traversed();
}				

}				














