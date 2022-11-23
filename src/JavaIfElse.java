import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// if else statements
		int age = 90;
		if(age > 80) {
			System.out.println("You are to old to enter");
		}else if( age > 18) {
			System.out.println("Enter to club");
		}else {
			System.out.println("You can not enter");
		}
		
		
		//switch statement
		String day = "Sunda";
		switch(day) {
			case "Sunday":
				System.out.println("It is sunday");
				break;
			case "Monday":
				System.out.println("It is monday");
				break;
			case "Tuesday":
				System.out.println("It is tuesday");
				break;
			case "Wednesday":
				System.out.println("It is wednesday");
				break;
			case "Thrusday":
				System.out.println("It is thrusday");
				break;
			case "Friday":
				System.out.println("It is friday");
				break;	
			case "Saturday":
				System.out.println("It is saturday");
				break;
			default:
				System.out.println("Day not found");
			
		}
		
		
		
		//logical operators
		int temp = 230;
		if(temp > 40) {
			System.out.println("Its hot");
		}else if(temp >= 20 && temp < 30) {
			System.out.println("Its warm");
		} else {
			System.out.println("its cold");
		}
		
		
		
		
		
		//game
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game. Press q or Q to quite");
		String res = scanner.next();
		
//		if(res.equals("q") || res.equals("Q")) {
//			System.out.println("You have quit the game");
//		}else {
//			System.out.println("You are in the game");
//		}
		
		if(!res.equals("q") && !res.equals("Q")) {
			System.out.println("You are in the game");
		}else {
			System.out.println("You have quit the game");
		}
		
		
		
		
		
	}

}
