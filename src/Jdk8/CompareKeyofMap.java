package collectionPrac;

import java.util.HashMap;
import java.util.Set;

public class CompareKeyofMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("A", 1);
		hm.put("B", 2);
		hm.put("C", 3);

		HashMap<String, Integer> hm2 = new HashMap<>();
		hm2.put("A", 1);
		hm2.put("C", 3);
		hm2.put("B", 2);

		HashMap<String, Integer> hm3 = new HashMap<>();
		hm3.put("A", 1);
		hm3.put("C", 3);
		hm3.put("B", 2);
		hm3.put("D", 4);
		  
		Set<String>ss= hm.keySet();
		System.out.println("KEYs"+ss);
		
		if(hm.keySet().equals(hm2.keySet())) {
			System.out.println("Keys are same");
		}
		else
		{
			System.err.println("Keys are not same ");
		}
		if(hm.keySet().equals(hm3.keySet())) {
			System.out.println("Keys are same");
		}
		else
		{
			System.err.println("Keys are not same ");
		}
		
	}

}
