package chapter5.linkedlist;

public class MyListNode {

	private String data;
	public MyListNode next;
	
	public MyListNode() {
		super();
		this.data = null;
		this.next = null;
	}

	public MyListNode(String data) {
		super();
		this.data = data;
		this.next = null;
	}

	public MyListNode(String data, MyListNode next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	public String getData() {
		return data;
	}
}
