package vladimir.tosic;

import java.util.Scanner;

public class domaci2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i =1,n;
		double s = 0;
		System.out.println("unesite n");
		n = sc.nextInt();
		
		do {
			s+= 1.0/Math.pow(3*i, 2);
			i++;
		} while(i<=n);
		System.out.println("Suma je "+s);
		sc.close();
	}

}
