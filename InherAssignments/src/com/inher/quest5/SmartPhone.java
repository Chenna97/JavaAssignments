package com.inher.quest5;

public class SmartPhone extends Mobile {
	
	
	@Override
	void call()
	{
	System.out.println("Calling via Smartphone ");	
		
	} 
	
	String[] apps()
	{
		
		return new String[] {"Whatsapp","PhonePay","Gpay","Gallary"};
		
	}
	

}
