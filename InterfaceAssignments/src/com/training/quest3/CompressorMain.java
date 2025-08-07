package com.training.quest3;

import java.util.Scanner;

public class CompressorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file type as z for zip, j for jar, r for rar ");
		String select =sc.next();
		IFileCompressor ifileCompressor = null;
		
		switch (select.toLowerCase()) {
		
		case "z":
			ifileCompressor = new ZipCompressor();
			
			ifileCompressor.compressFile( new String[]{"TextFiles", "WordFiles"});
			break;
			
		case "j":
			
			ifileCompressor = new JarCompressor();
			ifileCompressor.compressFile( new String[]{"NormalFiles", "GoogleFiles"});
			break;
			
		case "r":
			ifileCompressor = new  RarCompressor();
			
			ifileCompressor.compressFile( new String[]{"NvidiaFiles", "MicrosoftFiles"});
			break;
			
			default:
				
				System.out.println("Invalid option");
			
		}
		
		sc.close();

	}

}
