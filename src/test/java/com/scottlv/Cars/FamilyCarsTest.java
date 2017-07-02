package com.scottlv.Cars;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FamilyCarsTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FamilyCarsTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FamilyCarsTest.class );
    }

    /**
     * My Tests
     */
    public void testPersonName()
    {
        Person person = new Person("Jabba", "The Hut"); 
    	
        assertEquals(person.getName(), "Jabba The Hut");
    }

    public void testCarOwner()
    {
        Car car = new Car("Starship", "Enterprise");
        car.setOwner(new Person("Captain", "Kirk"));

        assertEquals("owned by Captain Kirk", car.getDetails());
    }

    public void testCarDriver()
    {
        Car car = new Car("Starship", "Enterprise");
        car.setDriver(new Person("Mr", "Spock"));

        assertEquals("driven by Mr Spock", car.getDetails());
    }
    
    public void testCarCopy()
    {
        Car car = new Car("Starship", "Enterprise");
        car.setOwner(new Person("Captain", "Kirk"));

        Car car2 = car;
        car2.setDriver(new Person("Mr", "Spock"));
        
        assertEquals("owned by Captain Kirk", car.getDetails());
        assertEquals("driven by Mr Spock", car2.getDetails());
    }
}
