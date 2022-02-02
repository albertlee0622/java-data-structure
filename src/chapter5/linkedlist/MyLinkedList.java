package chapter5.linkedlist;

public class MyLinkedList {
	
	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		super();
		this.head = null;
		this.count = 0;
	}

	public MyLinkedList(MyListNode newNode) {
		super();
		this.head = newNode;
		this.count = 1;
	}
	
	public MyListNode addElement(String data) {
		MyListNode newNode = new MyListNode(data);
		MyListNode iterator = head;
		if(iterator == null) {
			head = newNode;
		} else {
			while(iterator.next != null) {
				iterator = iterator.next;
			}
			iterator.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data) {
		MyListNode newNode = new MyListNode(data);
		if(position < 0 || position > count) {
			System.err.println("insert position error");
			return null;
		}
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			MyListNode iterator = head;
			for(int i = 1; i < position; i++) {
				iterator = iterator.next;
			}
			newNode.next = iterator.next;
			iterator.next = newNode;
		}
		count++;	
		return newNode;
	}
	
	public MyListNode removeElement(int position) {
		if(position < 0 || position >= count) {
			System.err.println("remove position error");
			return null;
		}
		
		MyListNode currNode = head;
		MyListNode prevNode = null;
		if(position == 0) {
			head = currNode.next;
		} else {			
			for(int i = 0; i < position; i++) {			
				prevNode = currNode;
				currNode = currNode.next;
			}
			prevNode.next = currNode.next;
		}
		count--;
		
		return currNode;
	}
	public String getElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(position == 0){  //맨 인 경우

			return head.getData();
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode.getData();
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 인 경우

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	public void removeAll()
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
	}
	
}

