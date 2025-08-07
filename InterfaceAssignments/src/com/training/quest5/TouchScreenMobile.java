package com.training.quest5;

public class TouchScreenMobile extends BasicMobile implements ISmartPhone {

	@Override
	public void showApps() {
		
		System.out.println("Apps Present in TouchScreenMobile are Whatsapp ,IRCTC, ... ");
		
	}

	@Override
	public void cameraTypes() {
		System.out.println("cameraTypes Present in TouchScreenMobile are selfie, rear camera ,  ... ");
		
	}
	
	

}
