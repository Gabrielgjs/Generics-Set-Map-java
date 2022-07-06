package application;

import java.util.Scanner;

import services.PrintServiceString;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		PrintServiceString ps = new PrintServiceString();
		
		System.out.print("how many values: ");
		int n  = scan.nextInt();
		
		for (int i=0; i < n; i++) {
			String value = scan.next();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println();
		System.out.println("First: "+ ps.first());
		
		scan.close();
	}

}
