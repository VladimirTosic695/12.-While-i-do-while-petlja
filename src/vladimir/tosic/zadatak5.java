package vladimir.tosic;

import java.util.Scanner;

public class zadatak5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,n,i=1;
		System.out.println("Unesite n.");
		n = sc.nextInt();
		System.out.println("Unesite a.");
		a = sc.nextInt();
		System.out.println("Brojevi koji su deljivi sa "+a+" od "+i+" do "+n+" su: ");
		
		while (i<=n) {
			if(i%a==0)
				System.out.print(" "+i);
				i++;
		} sc.close();
		

	}

}
