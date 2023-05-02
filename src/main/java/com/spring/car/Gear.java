package com.spring.car;

public class Gear {
	private int gear;

	public void show() {
		System.out.println("Gear");
	}

	public int change(int gearNumber) {
		return this.gear=gearNumber;
		
	}

}
