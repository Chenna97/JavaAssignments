package com.inher.quest3;

import java.util.Scanner;

public class Oval extends Figures {
	
	@Override
void volume(int x ,int y )
	
	{
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter third radius of Oval : ");
    int z = sc.nextInt();
    double vol = (4.0 / 3.0) * Math.PI * x * y * z;
    System.out.println("Volume of Oval : " + vol);
    
    sc.close();
	}

}
