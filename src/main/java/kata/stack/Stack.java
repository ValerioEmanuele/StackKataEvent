package kata.stack;

public class Stack {

	private static final int DEFAULT_CAPACITY = 5;
	private int[] elements;
	private int top;
	
	public Stack() {
		elements = new int[DEFAULT_CAPACITY];
		top = 0;
	}
	
	public Integer pop() {
		checkStackEmpty();
		return elements[--top];
	}

	public void push(int n) {
		if(top == elements.length) throw new RuntimeException("The stack is full!");
		elements[top++] = n;	
	}

	public Integer peek() {
		checkStackEmpty();
		return elements[top-1];
	}

	private void checkStackEmpty() {
		if(top == 0) throw new RuntimeException("The stack is empty!");
	}

}
