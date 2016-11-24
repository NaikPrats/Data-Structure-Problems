
public class addLinkedLists {

	// Java program to delete a given node in linked list under given constraints

	    static Node head1, head2;
	 
	    static class Node {
	        int data;
	        Node next;
	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    }
	    /* Adds contents of two linked lists and return the head node of resultant list */
	    Node addTwoLists(Node first, Node second) {

	    	int carry = 0;
    		Node res = null;
    		int sum =0;
    		Node temp = null;
    		Node prev = null; 
	    	
	    	while(first!= null || second!= null)
	    	{
	    		sum = carry + ((first == null)? 0:first.data ) + ((second == null)? 0:second.data);
	    		
	    		carry = (sum >=10)?1:0;
	    		sum =  sum%10;
	    		
	    		
	    		temp = new Node(sum);
	    		
	    		if(res == null)
	    			res = temp;
	    		else
	    			prev.next = temp;
	    		
	    		
	    		prev = temp;
	    		
	    		if(first!=null)
	    			first = first.next;
	    		
	    		if(second!=null)
	    			second = second.next;

	    	}
	    	if (carry > 0) {
	            temp.next = new Node(carry);
	        }
	 
	        // return head of the resultant list
	        return res;
	    	
	    	
	    }
	    /* Utility function to print a linked list */
	 
	    void printList(Node head) {
	        while (head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        System.out.println("");
	    }
	 
	    public static void main(String[] args) {
	    	addLinkedLists list = new addLinkedLists();
	 
	        // creating first list
	        list.head1 = new Node(7);
	        list.head1.next = new Node(5);
	        list.head1.next.next = new Node(9);
	        
	        
	        System.out.print("First List is ");
	        list.printList(head1);
	 
	        // creating seconnd list
	        list.head2 = new Node(8);
	        list.head2.next = new Node(4);
	        System.out.print("Second List is ");
	        list.printList(head2);
	 
	        // add the two lists and see the result
	        Node rs = list.addTwoLists(head1, head2);
	        System.out.print("Resultant List is ");
	        list.printList(rs);
	    }

	// this code has been contributed by Mayank Jaiswal

}
