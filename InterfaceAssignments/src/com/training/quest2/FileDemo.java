package com.training.quest2;

import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file type as z for zip, j for jar, r for rar ");
		String fileType = sc.next() ;
		IExtractor extractor = null;
		if(fileType.toLowerCase() == "z") {
			
			
			extractor=new  ZipExtractor();
			extractor.extractFiles(fileType);
			
		}
		else if(fileType.toLowerCase() == "j") {
			extractor=new  JarExtractor();
			extractor.extractFiles(fileType);
			
			
		}
		else {
			extractor=new RarExtractor();
			extractor.extractFiles(fileType);
		}
		sc.close();
	}

}
