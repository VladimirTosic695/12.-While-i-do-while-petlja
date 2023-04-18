package vladimir.tosic;

import java.util.Scanner;

public class zadatak12 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		/*
		 * double k, n; System.out.println("Unesite n."); n = sc.nextDouble();
		 * System.out.println("Unesite k."); k = sc.nextDouble();
		 * 
		 * double s = 0; int i = 0;
		 */

		int n, k;
		double s = 0;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		System.out.print("Unesite vrednost za k: ");
		k = ulaz.nextInt();
		int i = 0;
		do {
			s = s + 2 / (double) (k + i);
			++i;
		} while (i <= n);
		System.out.println("Suma je " + s);
		ulaz.close();

	}

}
