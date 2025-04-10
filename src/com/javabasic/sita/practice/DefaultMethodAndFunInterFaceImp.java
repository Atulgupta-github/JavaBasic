package com.javabasic.sita.practice;

public class DefaultMethodAndFunInterFaceImp {

	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.stop();
		car.run();

	}

}

interface carInterface{
	void start();
	
	default void stop() {
		System.out.println("car is stop");
	}
	default void run() {
		System.out.println("car is run");
	}
}

class Car implements carInterface{
	public void start() {
		System.out.println("Car is start");
	}
}