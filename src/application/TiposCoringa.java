package application;

import java.util.List;
import java.util.Arrays;

public class TiposCoringa {

	public static void main(String[] args) {
		
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStr = Arrays.asList("Maria", "Joao", "Figo");
		printList(myStr);
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
