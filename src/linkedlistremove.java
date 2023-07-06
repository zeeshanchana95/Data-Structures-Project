import java.io.File;

class linkedlistremove { 

	public Node head; 

	static class Node { 

		String data; 
		Node next; 

		Node(String d) { 
			data = d; 
			next = null; 
		} 
	} 
public void addAtStart(String a) {  
		
		File directory=new File(a);	
		File[] f=directory.listFiles();
	
		for(File file:f) {
			String na=file.getName();
		
			Node newNode=new Node(na);

		        if(head == null) {  
	            head = newNode;  
	            Node tail = newNode;  
	        }  
	        else {  
	            Node temp = head;  
	            head = newNode;  
	            head.next = temp;  
	       }  
	    }  
	}
	
	void remove_duplicates() { 
		Node ptr1 = null, ptr2 = null, dup = null; 
		ptr1 = head; 

		/* Pick elements one by one */
		while (ptr1 != null && ptr1.next != null) { 
			ptr2 = ptr1; 

			/* Compare the picked element with rest 
				of the elements */
			while (ptr2.next != null) { 

				/* If duplicate then delete it */
				if (ptr2.next.data.contains(" - Copy")) { 

					/* sequence of steps is important here */
					dup = ptr2.next; 
					ptr2.next = ptr2.next.next; 
					System.gc(); 
				} else /* This is tricky */ { 
					ptr2 = ptr2.next; 
				} 
			} 
			ptr1 = ptr1.next; 
		} 
	} 

	void printList() { 
		Node tmp=head;
		while (tmp != null) { 
			System.out.print(tmp.data + "\n"); 
			tmp = tmp.next; 
		} 
	} 

	public static void main(String[] args) { 

	
	
		linkedlistremove a=new linkedlistremove ();
		a.addAtStart("C:\\Users\\user\\Desktop");

		a.remove_duplicates();
		a.printList();
	} 
} 
// This code has been contributed by Mayank Jaiswal 
