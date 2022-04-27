package collectionPrac;

import java.util.HashMap;

public class comaprecollections {

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
		if (hm.equals(hm2)) {

			System.out.println("collection are same");
		} else {
			System.out.println("not same");
		}
		if (hm.equals(hm3)) {

			System.out.println("collection are same");
		} else {
			System.err.println("Keys are not same ");
		}
	}

}
