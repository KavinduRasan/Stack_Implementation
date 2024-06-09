package StackEx;



	import java.util.ArrayList;
	import java.util.List;

	public class ArrayListStack<T> {
	    private List<T> stack;

	    public ArrayListStack() {
	        stack = new ArrayList<>();
	    }

	    // Add element to the stack
	    public void push(T element) {
	        stack.add(element);
	    }

	    // Remove and return the top element of the stack
	    public T pop() {
	        if (stack.isEmpty()) {
	            throw new IllegalStateException("Stack is empty. Cannot pop element.");
	        }
	        return stack.remove(stack.size() - 1);
	    }

	    // Return the top element of the stack without removing it
	    public T peek() {
	        if (stack.isEmpty()) {
	            throw new IllegalStateException("Stack is empty. Cannot peek element.");
	        }
	        return stack.get(stack.size() - 1);
	    }

	    // Check if the stack is empty
	    public boolean isEmpty() {
	        return stack.isEmpty();
	    }

	    // Get the current size of the stack
	    public int size() {
	        return stack.size();
	    }

	    public static void main(String[] args) {
	        // Create a stack using ArrayListStack
	        ArrayListStack<Integer> myStack = new ArrayListStack<>();

	        // Add elements to the stack
	        myStack.push(10);
	        myStack.push(20);
	        myStack.push(30);

	        // Print the top element (peek)
	        System.out.println("Top element: " + myStack.peek());

	        // Remove an element from the stack
	        int poppedElement = myStack.pop();
	        System.out.println("Popped element: " + poppedElement);

	        // Check if the stack is empty
	        System.out.println("Is the stack empty? " + myStack.isEmpty());

	        // Get the size of the stack
	        System.out.println("Size of the stack: " + myStack.size());
	    }
	}



