package chapter5.queue;

import chapter5.linkedlist.MyLinkedList;
import chapter5.linkedlist.MyListNode;

interface IQueue {
	public void enQueue(String newData);
	public String deQueue();
	public void printAll();
}

public class MyListQueue implements IQueue {
	
	private MyLinkedList queue;

	public MyListQueue() {
		super();
		this.queue = new MyLinkedList();
	}

	@Override
	public void enQueue(String newData) {
		queue.addElement(newData);
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		MyListNode removedNode = queue.removeElement(0);
		return (removedNode != null) ? removedNode.getData() : null;
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		queue.printAll();
	}

}
