
public class JavaStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Friends friend1 = new Friends("Bob");
		Friends friend2 = new Friends("Sponge");
		Friends friend3 = new Friends("Squidward");

//		System.out.println(Friends.numberOfFriends);
		
		Friends.displayFriends();
		
		//inheritance
		Train trainOne = new Train();
		trainOne.miles();
		
		Bicycle bikeOne = new Bicycle();
		bikeOne.wheel();
		
		System.out.println(trainOne.drivers);
		System.out.println(bikeOne.doors);
		
		
	}

}
