package application;

import java.util.HashSet;
import java.util.Set;

public class ProgramSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		// método verifica se o elemento está na coleção!
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
