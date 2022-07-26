package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramSet {

	public static void main(String[] args) {
		
		// LinkedHashSet mantem a ordem que os elementos foram inseridos
		Set<String> set = new LinkedHashSet	<>();
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
