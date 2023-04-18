package vladimir.tosic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class domaci3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		double x=1,y;
		int i = 0;
	//	System.out.println("Unesite x");
	//	x = sc.nextDouble();
	/*	System.out.println("\tR.BR."+"\tX"+"\tY(x)");
		while (x<=5) {
			y = x-0.8*Math.pow(x, 2);
			x+=0.5;
			i++;
			System.out.println("\t"+i+"\t"+df.format(x)+"\t"+df.format(y));
		}*/	sc.close();
		System.out.println("\tR.BR."+"\tX"+"\tY(x)");
		for (x = 1; x<=5;x+=0.5) {
			y = x-0.8*Math.pow(x, 2);
			i++;
			System.out.println("\t"+i+"\t"+df.format(x)+"\t"+df.format(y));
		}
		
		
		
	}

}
