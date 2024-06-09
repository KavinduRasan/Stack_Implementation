package StackEx;



	import java.util.ArrayDeque;
	import java.util.Deque;

	public class ArrayDequeStack<T> {
	    private Deque<T> stack;

	    public ArrayDequeStack() {
	        stack = new ArrayDeque<>();
	    }

	    // Add element to the stack
	    public void push(T element) {
	        stack.addFirst(element);
	    }

	    // Remove and return the top element of the stack
	    public T pop() {
	        if (stack.isEmpty()) {
	            throw new IllegalStateException("Stack is empty. Cannot pop element.");
	        }
	        return stack.removeFirst();
	    }

	    // Return the top element of the stack without removing it
	    public T peek() {
	        if (stack.isEmpty()) {
	            throw new IllegalStateException("Stack is empty. Cannot peek element.");
	        }
	        return stack.peekFirst();
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
	        // Create a stack using ArrayDequeStack
	        ArrayDequeStack<String> myStack = new ArrayDequeStack<>();

	        // Add elements to the stack
	        myStack.push("20");
	        myStack.push("50");
	        myStack.push("60");

	        // Print the top element (peek)
	        System.out.println("Top element: " + myStack.peek());

	        // Remove an element from the stack
	        String removedElement = myStack.pop();
	        System.out.println("Removed element: " + removedElement);

	        // Check if the stack is empty
	        System.out.println("Is the stack empty? " + myStack.isEmpty());

	        // Get the size of the stack
	        System.out.println("Size of the stack: " + myStack.size());
	    }
	}



