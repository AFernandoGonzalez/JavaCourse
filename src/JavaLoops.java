import java.util.Scanner;

public class JavaLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("hi, " + name);
		
		
		
		//for loop
		for(int x=0; x <= 10 ; x++ ) {
			System.out.println("Num: " + x * 2);
		}
		System.out.println("For Loop Increment is completed");
		
		
		for(int x=10; x > 0 ; x-- ) {
			System.out.println("Num: " + x * 2);
		}
		System.out.println("For Loop Decrement is completed");
		
		
		
		//nexted loops
		//rectangle
		int rows ;
		int cols;
		String sym = "";
		
		System.out.println("Enter a row#: ");
		rows = scanner.nextInt();
		System.out.println("Enter a col#: ");
		cols = scanner.nextInt();
		
		System.out.println("Enter a sym to use: ");
		sym = scanner.next();
		
		
		//outer loop
		for(int i=1; i <= rows; i++) {
			System.out.println();
			//inner loop
			for(int j=1; j <= cols; j++) {
				System.out.print(sym);
			}
		}
		
		
		
		
		
		
	}

}
