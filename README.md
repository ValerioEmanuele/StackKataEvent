# Problem Description - Stack Kata
![Stack GIF](stack.gif)

Create a simple stack data structure with the following features:
    
    - push an integer onto the the top of the stack
    - peek the integer at the top of stack
    - pop: get and remove the integer at the top of the stack

## Starting point and constraints

Start with a class with the following structure:
		
		public class Stack{
    		public void push(Integer item); //Pushes an item onto the top of this stack.
    		
    		public Integer peek();		//Looks at the integer at the top of this stack without removing it.
    		
    		public Integer pop();		//Removes the integer at the top of this stack and returns it.
    	}	
1. You aren't allowed to add any other public method
2. The stack can contains only Integer and it's default capacity it's of 5 integers (keep it simple)
3. Do not authorize push when is full and throws an exception with message "The stack is full!"
4. Do not authorize pop and peek when is empty and throws an exception with message "The stack is empty!"

## Other constraints
	- TDD
	- Java 8 or higher
	- JUnit 5
	- AssertJ