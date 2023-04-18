package vladimir.tosic;

import java.util.Scanner;

public class zadatak6 {

	public static void main(String[] args) {
		// Ispisivanje sume od k do zadatog n
		Scanner sc = new Scanner(System.in);
		int k,n,s=0;
		System.out.println("Unesite k.");
		k = sc.nextInt();
		System.out.println("Unesite n.");
		n = sc.nextInt();
		
		int i = k;
		while (i<=n) {
			s+=i;
			i++;
		} sc.close();
		System.out.println("Suma brojeva od "+k+" do "+n+" je "+s);

	}

}
