package iterator;

import java.util.Iterator;
import iterator.ListIterator;
public class ListToIterate implements Iterable<Integer> {
	
	private static final int MAX_SIZE = 10;
	private int length = 0;
    private Integer list[];
    
    ListToIterate(){
    	list=new Integer[MAX_SIZE];	
    }
    
	@Override
	public Iterator<Integer> iterator() {
		
		return new ListIterator(list, length);
	}

	public void addItem(Integer integer) throws Exception{
		if(length >= MAX_SIZE){
			throw new Exception("list is full");
		}else{
			list[length++] = integer;
		}
}
	
}
