package com.jrp.pma.springExample;

public class Car {

	Engine e;
	Doors d;
	Tires t;

	public Car() {
	}

	public Car(Engine e, Doors d, Tires t) {
		super();
		this.d = d;
		this.e = e;
		this.t = t;
	}

	public Doors getD() {
		return d;
	}

	public void setD(Doors d) {
		this.d = d;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public Tires getT() {
		return t;
	}

	public void setT(Tires t) {
		this.t = t;
	}

}
