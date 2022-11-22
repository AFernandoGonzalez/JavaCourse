import java.util.Scanner;

public class JavaUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name: ");
		String name = scanner.nextLine();
		
		System.out.println("What is your age: ");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("What is your fave food?");
		String food = scanner.nextLine();
		
		System.out.println("hi " + name + " and you are " + age + " years old " + "and your favorite food is " + food);
	}

}
