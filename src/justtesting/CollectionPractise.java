package justtesting;


import java.util.HashMap;
import java.util.Map;

public class CollectionPractise {

	
	
	public static void main(String[] args) {
	
		
		Map<Integer,String>cars=new HashMap<>();
		

cars.put(1, "a");
cars.put(2, "b");
cars.put(3, "c");
	
	for(Map.Entry<Integer, String>e:cars.entrySet()) {
		System.out.println(e.getKey()+":"+e.getValue());
	}
		}
	}

