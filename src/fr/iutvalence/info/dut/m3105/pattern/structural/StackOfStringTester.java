package fr.iutvalence.info.dut.m3105.pattern.structural;


public class StackOfStringTester {
	private ArrayStack stack;

	public StackOfStringTester(ArrayStack stack) {
		this.stack = stack;
	}

	public void testStack() {
		System.out.println(this.stack.size());
		
		this.stack.push("a");
		System.out.println("\"a\" string pushed to the stack");
		
		System.out.println(this.stack.size());

		this.stack.push("b");
		System.out.println("\"b\" string pushed to the stack");
		
		System.out.println(this.stack.size());
		
		System.out.println("peek : "  + this.stack.peek());
		System.out.println(this.stack.size());
		
		System.out.println("pop : "  + this.stack.pop());
		System.out.println(this.stack.size());

		System.out.println("pop : "  + this.stack.pop());
		System.out.println(this.stack.size());
	}
}
