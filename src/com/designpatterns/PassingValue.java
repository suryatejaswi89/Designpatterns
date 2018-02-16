package com.designpatterns;

public class PassingValue {

	public static void main(String[] args) {
		Animal a1 = new Animal("Lion");
		Animal a2 = new Animal("Tiger");
		
		System.out.println("Before swap a1"+a1  + "and a2" + a2);
		swap(a1,a2);
		System.out.println("After swap a1"+a1  +" and a2" + a2);
		
		// TODO Auto-generated method stub

	}
	
	public static void swap(Animal animal1, Animal animal2){
		Animal temp = new Animal("");
		temp = animal1;
		animal1 = animal2;
		animal2 = temp;
		System.out.println(animal1);
		System.out.println(animal2);
	}

}
