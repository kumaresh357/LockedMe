package lockedMe;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExecuteMenuOption {
	
//	-------------------method for creating a directory----------------------- 
	public static void createDirectory() {
		try {
		File dir = new File("main");
			if(!dir.exists()) {
				dir.mkdirs();
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
//	--------------------method for displaying all files of directory in ascending order----------------------
	public static void getAllFiles() {
		try {
		createDirectory();
		File dir = new File("main");
			File [] files = dir.listFiles();
			List<File> filesList = Arrays.asList(files);
			Collections.sort(filesList);
			System.out.println("displaying all files in ascending order\n");
			for(File file: filesList) {
				System.out.println(file.getName());
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
//	--------------------method for creating a file in the directory----------------------------
	public static void addFiles() {
		createDirectory();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the desired name of file which needs to be added in directory");
		String filename = sc.nextLine();
		File file = new File("main/"+filename);
		try {
			if(file.createNewFile()) {
			    System.out.println("file successfully created");
			}
			else {
				System.out.println("file already exists");
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		ChooseMenuOption.choosingMenuTwo();
		sc.close();
	}
	
//	--------------------method for searching a file in the directory-------------------------
	public static void searchFiles() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the desired name of file with extention which needs to be searched from directory");
		String filename = sc.nextLine();
		File file = new File("main/"+filename);
		try {
			if (file.exists()) {
			System.out.println("file found\n"+file.getAbsolutePath());
			}
			else {
				System.out.println("file not found");
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		ChooseMenuOption.choosingMenuTwo();
		sc.close();
	}
	
//	---------------------method for deleting a file from the directory----------------------
	public static void deleteFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the desired name of file with extention which needs to be deleted from directory");
		String filename = sc.nextLine();
		File file = new File("main/"+filename);
		try {
			if(file.exists()) {
				file.delete();
				System.out.println("file successfully deleted");
			}
			else {
				System.out.println("unable to delete, no such file is found");	
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		ChooseMenuOption.choosingMenuTwo();
		sc.close();
	}
}
