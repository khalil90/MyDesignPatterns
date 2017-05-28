package iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws Exception {
		
      ListToIterate myList= new ListToIterate();
      myList.addItem(1);
      myList.addItem(2);
      myList.addItem(3);
      myList.addItem(4);
      myList.addItem(5);
      
      Iterator<Integer> iterator = myList.iterator();
      
      while(iterator.hasNext()){
    	  
			System.out.println(iterator.next());
                                
      }
	}

}
