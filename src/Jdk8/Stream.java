package Jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {

		List<String>com= new ArrayList<String>(Arrays.asList("TCS","CTS","HCL","Wipro","Infy","SAP"));

		//we ness the a list of data  which contain compnay name lenght should be 3 by using java stream



		List<String>dd=com.stream().filter(x->x.equals(x.length()==3)).collect(Collectors.toList());
		 System.out.println(dd);




	}

}
