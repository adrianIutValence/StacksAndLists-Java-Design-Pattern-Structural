package fr.iutvalence.info.dut.m3105.pattern.structural;

import java.util.List;

public class ArrayListToArrayStackAdapter<E> implements Stack<E>{
	
	private List<E> list;

	public ArrayListToArrayStackAdapter(List<E> list){
		this.list = list;
	}

	@Override
	public void push(E item) {
		this.list.add(item);
	}

	@Override
	public E peek() {
		return this.list.get(this.size()-1);
	}

	@Override
	public E pop() {
		return this.list.remove(this.size());
	}

	@Override
	public int size() {
		return this.list.size();
	}
	
	
}
