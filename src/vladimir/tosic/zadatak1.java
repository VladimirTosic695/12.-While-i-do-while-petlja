package vladimir.tosic;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n; double i =1,s=0;
		System.out.println("Unesite n.");
		n = sc.nextInt();
		
		while (i<=n) {
			s+=1/i;
			i++;
		}
		System.out.println("Suma je "+s);
		sc.close();
	}

}
