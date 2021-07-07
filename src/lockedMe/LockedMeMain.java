package lockedMe;

public class LockedMeMain {

	public static void main(String[] args) {
		
		ExecuteMenuOption.createDirectory();       
		
		System.out.println("\nWelcome to LockedMe Application\n"+"Developed By Kumaresh Chandra Dey\n");
		System.out.println("----------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Functions provided by application\n\n"
				+ "* Retrieving the file names in an ascending order.\n"
				+ "* Option to add a user specified file to the application.\n"
				+ "* Option to delete a user specified file from the application.\n"
				+ "* Option to search a user specified file from the application.\n"
				+ "* Navigation option to close the current execution context and return to the main context.\n"
				+ "* Option to close the application.\n");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		
		ChooseMenuOption.choosingMenuOne();
	}
}