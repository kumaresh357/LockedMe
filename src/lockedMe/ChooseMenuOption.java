package lockedMe;
import java.util.Scanner;

public class ChooseMenuOption {
	public static void choosingMenuOne() {
		try {
		Scanner sc = new Scanner(System.in);
		DisplayMenuOption.displayMenuOne();
		int choice = sc.nextInt();
			switch(choice) {
			case 1:
				ExecuteMenuOption.getAllFiles();
				choosingMenuOne();
				break;
			case 2:
				choosingMenuTwo();
				break;
			case 3:
				System.out.println("Program Terminated");
				sc.close();
				System.exit(0);
				break;
			default :
				System.out.println("Choose a valid option");
				choosingMenuOne();
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void choosingMenuTwo() {
		try {
		Scanner sc = new Scanner(System.in);
		DisplayMenuOption.displayMenuTwo();
		int choice = sc.nextInt();
			switch(choice) {
			case 1:
				ExecuteMenuOption.addFiles();
				break;
			case 2:
				ExecuteMenuOption.searchFiles();
				break;
			case 3:
				ExecuteMenuOption.deleteFile();
				break;
			case 4:
				choosingMenuOne();
				break;
			case 5:
				System.out.println("Program Terminated");
				sc.close();
				System.exit(0);
				break;
			default :
				System.out.println("Choose a valid option");
				choosingMenuTwo();
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}	
	}
}
