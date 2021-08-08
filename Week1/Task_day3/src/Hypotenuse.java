import java.util.Scanner;
import java.lang.Math;

public class Hypotenuse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=Integer.parseInt(sc.nextLine()); 
		
		int b=Integer.parseInt(sc.nextLine()); 
		System.out.println("side1="+a);
		System.out.println("side2="+b);
		
		double c;
		c=Math.pow((Math.pow(a, 2)+Math.pow(b, 2)), 0.5);
		System.out.println("Hypotenuse="+c);
		
	}

}
