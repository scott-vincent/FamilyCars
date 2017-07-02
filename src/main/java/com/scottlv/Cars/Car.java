package com.scottlv.Cars;

public class Car {
	private String make;
	private String model;
	private Person person;
	private boolean isOwner;
	
	public Car(String make, String model) {
		this.make = make;
		this.model = model;
		person = null;
		isOwner = false;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getDetails() {
		if (person == null)
			return "no owner or driver";
		else if (isOwner)
			return "owned by " + person.getName();
		else
			return "driven by " + person.getName();
	}
	
	public void setOwner(Person person) {
		this.person = person;
		isOwner = true;
	}

	public void setDriver(Person person) {
		this.person = person;
		isOwner = false;
	}
	
	public Car makeCopy() {
		Car copy = new Car(make, model);
		
		// Make sure the copy has the same owner/driver
		if (isOwner)
			copy.setOwner(person);
		else
			copy.setDriver(person);
			
		return copy;
	}
}
