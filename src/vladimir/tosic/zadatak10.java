package vladimir.tosic;

import java.util.Scanner;

public class zadatak10 {

	public static void main(String[] args) {
			
	/*	Scanner sc = new Scanner (System.in);
		
		double s = 0,i=1;
		System.out.println("Unesite n.");
		double n = sc.nextDouble();
		
		while(i<=n) {
			s+= 1/2*i;
			i++;
		}
		System.out.println("Suma je "+s);*/
		 Scanner ulaz = new Scanner (System.in);
		 int n; double s = 0;
		 System.out.print("Unesite vrednost za n: ");
		 n = ulaz.nextInt();
		 int i = 1;
		 while (i <= n)
		 { 
			 s += 1/(double)(2 * i); 
			 i++;
			 } 
		 System.out.println("n = " + n + " s = " + s); ulaz.close();
	}

}
