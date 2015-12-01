package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface Stack<E> {
	
	void push(E item);
	
	E peek();
	
	E pop();
	
	int size();
}
