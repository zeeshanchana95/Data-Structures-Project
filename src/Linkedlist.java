import java.io.File;



public class Linkedlist {
	public Node head;
	
	public Linkedlist() {
		
	}

	public void addAtStart(String a) {  
		
		File directory=new File(a);	
		File[] f=directory.listFiles();
	
		for(File file:f) {
			String fn=file.toString();
			String fa=file.getAbsolutePath();
			String pa=file.getParent();
			String na=file.getName();
			long xc=file.length();
			if(fn.lastIndexOf('.')>0)
	        {
	          
	           int lastIndex = fn.lastIndexOf('.');
	    		}
			Node newNode=new Node(fa,na,xc,pa);

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

	
	while (ptr1 != null && ptr1.next != null) { 
		ptr2 = ptr1; 

		
		while (ptr2.next != null) { 

			
			if (ptr2.next.name.contains(" - Copy")) { 

				File d=new File(ptr2.next.dire);
				d.delete();
				dup = ptr2.next; 
				ptr2.next = ptr2.next.next; 
				System.gc(); 
			} else { 
				ptr2 = ptr2.next; 
			} 
		} 
		ptr1 = ptr1.next; 
	} 
	  Node current = head;  
      if(head == null) {  
           System.out.println("List is empty");  
           return;  
       }  
       System.out.println("Adding nodes to the start of the list: ");  
       while(current != null) {  
           
           System.out.println(current.name);  
           current = current.next;  
       }  
       System.out.println();  
	}
		 public void display() {  
		        
		        Node current = head;  
		        if(head == null) {  
		             System.out.println("List is empty");  
		             return;  
		         }  
		         System.out.println("Adding nodes to the start of the list: ");  
		         while(current != null) {  
		             
		             System.out.println(current.dire + " "+current.size+current.parent);  
		             current = current.next;  
		         }  
		         System.out.println();  
		     }
		 
		 
		 
		 
		 
		  

}
	

