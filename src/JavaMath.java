import java.util.Random;
import java.util.Scanner;

public class JavaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x  = 3.14;
		double y = 10;
		double z = -30;
		
		double a = Math.max(x, y);
		double b = Math.min(x, y);
		double c  = Math.abs(z);
		double d  = Math.sqrt(y);
		double e  = Math.round(x);
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		
//		hypotenous
		
//		double f;
//		double g;
//		double h;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter side x: ");
//		f = scanner.nextDouble();
//		System.out.println("Enter side x: ");
//		g = scanner.nextDouble();
//		
//		h = Math.sqrt((f*f)+ (g*g));
//		
//		System.out.println("The Hypotenous: " + h);
//		
//		scanner.close();
		
		
		
//	    generate random number 
		Random random = new Random();
		// limit the size of the int gnerated
		int randN = random.nextInt(6);
		
		System.out.println("Your num is " + randN);
	}

}
