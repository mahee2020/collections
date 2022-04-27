package collectionPrac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindExtraKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("A", 1);
		hm.put("B", 2);
		hm.put("C", 3);

		HashMap<String, Integer> hm3 = new HashMap<>();
		hm3.put("A", 1);
		hm3.put("C", 3);
		hm3.put("B", 2);
		hm3.put("D", 4);
		
		
		Set<String>total= new HashSet<>(hm.keySet());
		total.addAll(hm3.keySet());
		total.removeAll(hm.keySet());
		System.out.println("Extra key "+ total);
		 
		
		
		
	}

}
