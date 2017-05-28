package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListIterator implements Iterator<Integer> {

	private Integer list[];
	private int size = 0;
	private int curIndex = 0;
	
	 ListIterator(Integer[] list, int size) {
		this.list = list;
		this.size = size;
	}
	
	@Override
	public boolean hasNext() {
		return size > curIndex;
	}

	@Override
	public Integer next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return list[curIndex++];
	}
	
	public void remove(){
		throw new UnsupportedOperationException(); 
}

	
	
}
