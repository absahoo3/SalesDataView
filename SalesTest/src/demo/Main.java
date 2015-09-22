package demo;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreetings();
		data.display();

	}

	private static void displayGreetings() {
		System.out.println("Hello Sales people");
		System.out.println("This App Shows Sales data");
		
	}

}
