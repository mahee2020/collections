package collectionPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CompareValueOfMap {

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
		
		 List<Integer>dd=new ArrayList<>(hm.values());
		 
		 System.out.println("LIST "+dd);
		
		if( new ArrayList<>(hm.values()).equals(new ArrayList<>(hm2.values()))){
		System.out.println("value are same ");
		}
		else {
			System.out.println("not same ");
		}
		if( new ArrayList<>(hm.values()).equals(new ArrayList<>(hm3.values()))){
			System.out.println("value are same ");
			}
			else {
				System.out.println("not same ");
			}
	}

}
