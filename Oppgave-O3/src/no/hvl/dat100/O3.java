package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Velg en verdi n: ");
		double n = parseInt(input.nextLine());
		
		double temp = 1;
		while(n>0){
			temp *=n;
			n--;
		}
		System.out.println(temp);
		
		
		
		
		
	}

}
