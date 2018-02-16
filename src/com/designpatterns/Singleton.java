package com.designpatterns;

public class Singleton {
	
	private static Singleton singletonInstance = null;
	
	private Singleton(){
		
	}
	
	@SuppressWarnings("unused")
	private static Singleton getInstance(){
		if(singletonInstance == null){
			singletonInstance = new Singleton();
		}
		else{
			return singletonInstance;
		}
		return singletonInstance;
		
		
	}

}
