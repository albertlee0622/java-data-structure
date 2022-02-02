package chapter5.array;

public class MyArray {
	
	int[] intArr;
	int count;
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = Integer.MAX_VALUE;
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
	}
	
	public void addElement(int num) {
		if(count >= ARRAY_SIZE) {
			System.err.println("index exceeds array size");
			return;
		}
		intArr[count++] = num;
	}
	
	public void insertElement(int position, int num) {
		if(count >= ARRAY_SIZE) {
			System.err.println("index exceeds array size");
			return;
		}	
		if(position < 0 || position > count) {
			System.err.println("insert position error");
			return;
		}
		
		for(int i = count-1; i >= position; i--) {
			intArr[i+1] = intArr[i];
		}
		intArr[position] = num;
		count++;
	}
	
	public int removeElement(int position) {
		if(isEmpty()) {
			System.err.println("empty array error");
			return ERROR_NUM;
		}
		if(position < 0 || position >= count) {
			System.err.println("remove position error");
			return ERROR_NUM;
		}
		
		int targetNum = intArr[position];
		for(int i = count-1; i > position; i--) {
			intArr[i-1] = intArr[i];
		}
		count--;
		
		return targetNum;
	}
	
	public int getSize() {
		return count;
	}
	
	public boolean isEmpty() {
		return (count <= 0) ? true : false;
	}
	
	public int getElement(int position) {
		if(isEmpty()) {
			System.err.println("empty array error");
			return ERROR_NUM;
		}
		if(position < 0 || position >= count) {
			System.err.println("get position error");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll() {
		if(isEmpty()) {
			System.out.println("Array is empty");
		}
		else {
			for(int i = 0; i < count; i++) {
				System.out.print(intArr[i] + " ");
			}
			System.out.println("");
		}
	}
	
	public void removeAll() {
		count = 0;
	}
}
