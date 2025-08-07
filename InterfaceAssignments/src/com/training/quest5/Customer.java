package com.training.quest5;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" you wants touch screen or basic phone");

		String type = sc.next().toLowerCase();

		IFeaturePhone iFeature;

		switch (type) {

		case "basicPhone":
			iFeature = new BasicMobile();

			iFeature.call();
			iFeature.messaging();
			break;

		case "touchscreen":

			iFeature = new TouchScreenMobile();
			iFeature.call();
			iFeature.messaging();
			ISmartPhone iSmartPhone = (ISmartPhone) iFeature;

			iSmartPhone.showApps();
			iSmartPhone.cameraTypes();

			break;

		default:

			System.out.println("Invalid choice. Please enter 'basic' or 'touch'.");

		}
sc.close();
	}

}
