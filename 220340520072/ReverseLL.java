class ReverseLL{
	
	class Node{
		int data;
		Node next;
		
	Node(int data){
		this.data = data;
		this.next = null;
	}
}	
	Node head = null;
	
	void addNode(int data){
		Node temp = head;
		Node newNode = new Node(data);
		
		if(temp == null){
			head = newNode;
		}else{
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	Node reverse(){
		Node temp = head;
		Node prev = null;
		Node current = null;;
		
		while(temp != null){
			
			current = temp.next;
			temp.next = prev;
			prev = temp;
			temp = current;
			
		}
		head = prev;
		return head;
	}
	
	void display(Node head){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args){
		
		ReverseLL rsl = new ReverseLL();
		
		
		rsl.addNode(3);
		rsl.addNode(4);
		rsl.addNode(2);
		rsl.addNode(5);
		
		Node temp2 = rsl.reverse();
		rsl.display(temp2);
		
	}
}

