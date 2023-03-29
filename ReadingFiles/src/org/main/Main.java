package org.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File newFile = new File("src\\BlackManifesto.txt");
//		try {
//			newFile.createNewFile();System.out.println("File Was Created, You are being hacked");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		File newDirectory = new File("c:\\users\\"+System.getProperty("user.name")+"\\Black_Kombo");
		newDirectory.mkdir();
		
		System.out.println("File created in "+System.getProperty("user.name")+" Directory");
		
		newDirectory = new File("c:\\users\\"+System.getProperty("user.name")+"\\Black_Kombo\\BlackManifesto.txt");
//		newFile = new File("BlackManifesto.txt");
		try {
			newDirectory.createNewFile();System.out.println("File Was Created, You are being hacked");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(newDirectory))) {
			writer.write("Frank");
			writer.newLine();
			writer.write("Michael");
			writer.newLine();
			writer.write("Jason");
			writer.newLine();
			writer.write("Mike");
			writer.newLine();
			System.out.println("File Written to drive.");
			writer.close();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("c:\\users\\"+System.getProperty("user.name")+"\\Black_Kombo\\BlackManifesto.txt"));
			String line;
			try {
				while((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Scanner scanner = new Scanner(new File("test.txt"));
			String line;
			while(scanner.hasNext()) {
				line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Reading File");
			e.printStackTrace();
		}
		
		
	}

}
