package com.spring.car;


public class Car {
    private Engine engine;
    private Brakes brakes;
    private Gear gear;

    // Constructor injection for all dependencies
    public Car(Engine engine, Brakes brakes, Gear gear) {
        this.engine = engine;
        this.brakes = brakes;
        this.gear = gear;
    }

    // Setter injection for engine dependency
    public void setEngine1(Engine engine) {
        this.engine = engine;
    }

    // Setter injection for brakes dependency
    public void setBrakes1(Brakes brakes) {
        this.brakes = brakes;
    }

    // Setter injection for gear dependency
    public void setGear1(Gear gear) {
        this.gear = gear;
    }

    // Field injection for engine dependency
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Field injection for brakes dependency
    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    // Field injection for gear dependency
    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    // Additional methods
    public void start() {
        engine.start();
    }

    public void stop() {
        brakes.apply();
        engine.stop();
    }

    public int changeGear(int gearNumber) {
        return gear.change(gearNumber);
		
    }
}

