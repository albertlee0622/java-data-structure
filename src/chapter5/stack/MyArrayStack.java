package chapter5.stack;
import chapter5.array.MyArray;

public class MyArrayStack {
	
	private MyArray stack;

	public MyArrayStack() {
		super();
		this.stack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		super();
		this.stack = new MyArray(size);
	}
	
	public int peek() {
		int lastIndex = stack.getSize() - 1;
		return stack.getElement(lastIndex);
	}
	
	public void push(int newElement) {
		stack.addElement(newElement);
	}
	
	public int pop() {
		int lastIndex = stack.getSize() - 1;
		int removedElement = stack.removeElement(lastIndex);
		return removedElement;
	}
	
	public int getSize() {
		return stack.getSize();
	}
	
	public boolean isFull() {
		return (stack.ARRAY_SIZE == stack.getSize()) ? true : false;
	}
	
	public void printAll() {
		stack.printAll();
	}
	
}
