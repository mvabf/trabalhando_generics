package application;

import java.util.Scanner;

import services.PrintService;

public class Program {
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		PrintService<String> ps = new PrintService<>();
		System.out.print("How many values? ");
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			ps.addValue(in.next());
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		in.close();
	}
}
