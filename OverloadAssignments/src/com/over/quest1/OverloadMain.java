package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 Employee[] employees = new Employee[5];

	        // Input for 5 employees
	        for (int i = 0; i < employees.length; i++) {
	            System.out.print("Enter name for employee " + (i + 1) + ": ");
	            String name = sc.nextLine();

	            System.out.print("Enter designation (Programmer/Manager/Director): ");
	            String designation = sc.nextLine();

	            employees[i] = new Employee(name, designation);
	        }
		
		for(Employee emp : employees) {
			
		
		switch (emp.designation.toLowerCase()) {
		
		
		case "programmer":
            emp.calcBonus(2000.0);
            break;
        case "manager":
            emp.calcBonus(5000.0, "Iphone");
            break;
        case "director":
            emp.calcBonus(6000.0, "Laptop", 1000.0);
            break;
        default:
            System.out.println(emp.name + ": Invalid designation.");
            System.out.println();
		
		}
		
		}
		
		sc.close();
	}

}
