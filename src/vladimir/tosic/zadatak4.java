package vladimir.tosic;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Unesite n.");
		n = sc.nextInt();
		int i = 1;
		System.out.println("Neparni brojevi do "+n+" su:");
		while (i<=n) {
			if(i%2!=0)
				System.out.print(i+",");
			i++;
		}sc.close();

	}

}
