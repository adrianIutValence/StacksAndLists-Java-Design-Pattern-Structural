package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<E> implements Stack<E>{
	private E[] array;
	private int readingCursor;
	
	@SuppressWarnings("unchecked")
	public ArrayStack(){
		this.array = (E[]) new Object[10];
		this.readingCursor = 0;
	}
	
	public void push(E item){
		this.array[this.readingCursor] = item;
		this.readingCursor += 1;
	}
	
	public E peek(){
		return this.array[this.readingCursor-1];
	}
	
	public E pop(){
		this.readingCursor -= 1;
		return this.array[this.readingCursor];
	}
	
	public int size(){
		return this.readingCursor;
	}
}
