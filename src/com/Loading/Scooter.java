package com.Loading;

abstract class Vehicle{
    abstract void starts();
}

class Car{
    void starts(){
        System.out.println("Starts with Key");
    }
}
public class Scooter {
    void starts(){
        System.out.println("starts with Kick");
    }

    public static void main(String[] args) {
	Car c1=new Car();
	c1.starts();

	Scooter s1=new Scooter();
	s1.starts();
    }
}
