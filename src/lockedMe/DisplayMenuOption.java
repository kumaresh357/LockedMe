package lockedMe;

public class DisplayMenuOption {
	
	public static void displayMenuOne() {
		System.out.println("\nChoose an option and press enter.\n"
				+ "1) Get all files from \"main\" folder.\n"
				+ "2) Display menu for file execution option.\n"
				+ "3) Exit the application.");
	}
	
	public static void displayMenuTwo() {
		System.out.println("\nChoose an option and press enter.\n"
				+ "1) Add a file in \"main\" folder.\n"
				+ "2) Search a file in \"main\" folder.\n"
				+ "3) Delete a file from \"main\" folder.\n"
				+ "4) Return Back to previous menu.\n"
				+ "5) Exit the application.");
	}
}