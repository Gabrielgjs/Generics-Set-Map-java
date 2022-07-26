package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {

	public static void main(String[] args) {
		
		// TreeSet ordena os dados 
		Set<String> set = new TreeSet<>();
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		// m�todo verifica se o elemento est� na cole��o!
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
