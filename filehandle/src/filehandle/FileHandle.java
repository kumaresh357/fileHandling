package filehandle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandle {
	public static void main(String[] args) {
//		------------- ------read file---------------------------
		try {
			File file = new File("abc.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
//		---------------------write file-------------------------
		try {
			FileWriter file = new FileWriter("abc.txt");
			file.write("write text");
			file.close();
		} 
		catch (Exception e) {
			System.out.println(e);
		}
//		---------------------append file------------------------
		try {
			File file = new File("abc.txt");
			FileWriter fr = new FileWriter(file, true);
			BufferedWriter br = new BufferedWriter(fr);
			PrintWriter pr = new PrintWriter(br);
			pr.println(" append text");
			pr.close();
			br.close();
			fr.close();
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}	
