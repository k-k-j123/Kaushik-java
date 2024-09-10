public class LinkedList{
	public class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}

	public static Node head;
	public static Node tail;
	public static Node temp;
	
	public void addFirst(int data){
		Node newNode=new Node(data);
		
		if(head==null){
			head=tail=newNode;
			return;
		}

		newNode.next=head;
		head=newNode;
	}

	public void addLast(int data){
		Node newNode=new Node(data);
		
		if(head==null){
			head=tail=newNode;
			return;
		}

		tail.next=newNode;
		tail=newNode;
	}

	public void addMiddle(int index,int data){
		if(index==0){
			addFirst(data);
			return;
		}
		Node newNode=new Node(data);
		temp=head;
		int i=0;
		while(i<index-1){
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}

	public void removeFirst(){
		if(size()==0){
			System.out.println("LinkedList is empty");
			return;
		}else if(size()==1){
			head=tail=null;
			return;
		}else{
			head=head.next;
		}
	}

	public void removeLast(){
		temp=head;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		temp.next=null;
	}

	public int size(){
		temp=head;
		int i=0;
		while(temp!=null){
			i++;
			temp=temp.next;
		}
		System.out.println("Size of LinkedList is "+i);
		return i;
	}

	public void printList(){
		temp=head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]){
		LinkedList ll=new LinkedList();
		ll.addLast(0);
		ll.addLast(1);
		ll.addFirst(-1);
		ll.addFirst(-2);
		ll.addMiddle(2, 9);
		ll.printList();
		ll.removeLast();
		ll.removeFirst();
		ll.printList();
	}
}
