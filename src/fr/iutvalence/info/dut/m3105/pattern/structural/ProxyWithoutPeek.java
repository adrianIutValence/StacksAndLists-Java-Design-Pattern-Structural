package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ProxyWithoutPeek<E> implements Stack<E>{
	
	private Stack<E> stack;

	public ProxyWithoutPeek(Stack<E> stack) {
		this.stack = stack;
	}

	@Override
	public void push(E item) {
		this.stack.push(item);
		
	}

	@Override
	public E peek() {
		return null;
	}

	@Override
	public E pop() {
		return this.stack.pop();
	}

	@Override
	public int size() {
		return this.stack.size();
	}

}
