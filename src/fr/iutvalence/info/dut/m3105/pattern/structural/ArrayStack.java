package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack {
	private String[] array;
	private int readingCursor;
	
	public ArrayStack(){
		this.array = new String[10];
		this.readingCursor = 0;
	}
	
	public void push(String item){
		this.array[this.readingCursor] = item;
		this.readingCursor += 1;
	}
	
	public String peek(){
		return this.array[this.readingCursor-1];
	}
	
	public String pop(){
		this.readingCursor -= 1;
		return this.array[this.readingCursor];
	}
	
	public int size(){
		return this.readingCursor;
	}
}
