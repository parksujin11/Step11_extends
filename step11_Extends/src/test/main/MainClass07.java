package test.main;

import test.auto.Car;
import test.auto.Taxi;
import test.auto.Truck;

public class MainClass07 {
	public static void main(String[] args) {
		Taxi car1=new Taxi();
		Truck car2=new Truck();
		
		car1.startEngine();
		car1.takePassenger();
		car1.drive();
		System.out.println();
		car2.startEngine();
		car2.loadObject();
		car2.drive();
		
		System.out.println("--------");
		
		MainClass07.useCar(car1);
		//Truck 객체의 참조값을 전달 했기 때문에 Exception 이 발생.
		useCar(car2);
	}
	
	public static void useCar(Car car) {
		car.startEngine();
		car.drive();
		
		Taxi t=(Taxi)car;
		t.takePassenger();
	}
}
