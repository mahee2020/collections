package collectionPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindExtraValue {

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
		
		     ArrayList<Integer> total=new ArrayList<>(hm.values());
		     total.addAll(new ArrayList<>(hm3.values()));
		     total.removeAll(new ArrayList<>(hm.values()));
		     System.out.println("Extra value"+total);
		
		
		
	}

}
