package vladimir.tosic;

import java.util.Scanner;

public class domaci1 {

	public static void main(String[] args) {
		// Napisati program za izračunavanje sume svih parnih 
	//brojeva od 1 do zadatog broja n korišćenje mwhile i do-while petlje.
		Scanner sc = new Scanner(System.in);
		
		double s = 0;
		int n,i = 1;
		System.out.println("Unesite n");
		n = sc.nextInt();
		
		/*do {
			if (i%2==0)
				s+=i;
			i++;
		} while (i<=n);
		System.out.println("Suma je "+s);*/
		
		while (i<=n) {
			if (i%2==0)
				s+=i;
			i++;
		} System.out.println("Suma je "+s);
		sc.close();
	}

}
