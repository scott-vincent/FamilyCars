package com.scottlv.Cars;

import java.util.ArrayList;
import java.util.List;

import com.scottlv.Cars.Car;
import com.scottlv.Cars.Person;

/**
 * Title: Family Cars
 * Author: Scott Vincent
 *
 */
public class FamilyCars 
{
    public static void main( String[] args )
    {
    	List<Car> familyCars = new ArrayList<Car>();

        Person scott = new Person("Scott", "Vincent"); 
        Person clare = new Person("Clare", "Vincent"); 
        Person ross = new Person("Ross", "Vincent");
        
        Car scottCar = new Car("Ford", "Focus");
        scottCar.setOwner(scott);
        familyCars.add(scottCar);

        Car clareCar = new Car("Honda", "Jazz");
        clareCar.setOwner(clare);
        familyCars.add(clareCar);

        Car rossCar = clareCar;
        rossCar.setDriver(ross);
        familyCars.add(rossCar);

    	System.out.println("Family Cars");
    	System.out.println("-----------");
    	
        for (Car car : familyCars) {
        	System.out.println(car.getMake() + " " + car.getModel() + " " + car.getDetails());
        }
    }
}
