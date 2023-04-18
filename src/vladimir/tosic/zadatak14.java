package vladimir.tosic;

import java.text.DecimalFormat;

public class zadatak14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=1.0,f;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("\tX"+"\tF(x)");
		for(x=1;x<=2;x+=0.2) {
	f = 41.926*Math.sqrt(1+Math.pow(x, 3)) + Math.pow(x, 1.0/3)*Math.exp(x);
	System.out.println("\t"+df.format(x)+"\t"+df.format(f));
		} 
	}

}
