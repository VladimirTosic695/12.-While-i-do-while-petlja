package vladimir.tosic;

import java.util.Scanner;

public class zadatak7 {

	public static void main(String[] args) {
		// suma brojeva od 1 do n cija je cifra jedinica 8.
		Scanner sc = new Scanner(System.in);
		int n,s=0,i=1;
		System.out.println("Unesite n.");
		n = sc.nextInt();
		
		while (i<=n) {
			if(i%10==8)
			s+=i;
			i++;
		}
		System.out.println("Suma brojeva cija je jedinaca 8 od broja 1 do "+n+" je "+s);
		sc.close();
	}

}
