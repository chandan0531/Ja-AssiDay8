package com.assi.Q4;

public class Main {
	
	public static void main(String[] args) {
		
		Animal[] arr = new Animal[3];
		
		// arr = {new Dog(), new Cat(), new Tiger()};
		arr[0] = new Dog();
		arr[1] = new Cat();
		arr[2] = new Tiger();
		
	
		for(Animal x: arr)
		{
			x.makeNoise();
		}
	}
}