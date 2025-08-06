package com.training.scan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDim {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the row size of array");
		int rsize = sc.nextInt();
		System.out.println("Enter the column size of array");
		int csize = sc.nextInt();
		String[] [] twodimarr =  new String[rsize][csize];
		System.out.println("Enter the  array elements");
		for(int i=0; i< rsize; i++) {
			for(int j=0;j<csize;j++) {
				
				twodimarr[i][j]=sc.next();
				

			}
		}
		
		  ArrayList<String> namesList = new ArrayList<>();
		  
		  for(int i=0; i< rsize; i++) {
				for(int j=0;j<csize;j++) {
					
				String names	= twodimarr[i][j];
				if (names.toLowerCase().startsWith("s")) {
					namesList.add(names);
                }
				
				}
		  }
		  
			System.out.println("array size  is : "+namesList.size());	
		  String[] snames = new String[namesList.size()];
		  snames = namesList.toArray(snames);
		  System.out.println("Names Start with S is : " + Arrays.toString(snames));
			
		
		  sc.close();
	}

		  }
