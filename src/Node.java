

class Node {
		String dire;
		String parent;
		String name;
		long size;
		Node next;
		
		
		public Node() {
			
		}
		
		public Node(String a) {
			
		}
		public Node(String a,String b,long c,String d) {
			this.dire=a;
			name=b;
			this.size=c;
			this.parent=d;
			next=null;
			}
		public String getDire() {
			return dire;
		}
		public void setDire(String dire) {
			this.dire = dire;
		}
		public String getParent() {
			return parent;
		}
		public void setParent(String parent) {
			this.parent = parent;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getSize() {
			return size;
		}
		public void setSize(long size) {
			this.size = size;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}	
		
			}
	