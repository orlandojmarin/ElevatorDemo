/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elevatordemo;

/**
 *
 * @author orlandomarin
 */
public class Elevator 
{
    // INSTANCE FIELDS (2)
    
    /* name, which is a String, is the name of the elevator. */
    
    /* floor, which is an int, is the floor where the elevator is. 1 is the main floor. There are no floors
       below 1. There are no floors above 10. */
    
    private String name;
    private int floor;
    
    // CONSTRUCTORS (2)
    
    /* One constructor accepts 1 argument, a String, for the name of an elevator. The floor
       field is initialized to 1. */
    
    /* The other constructor is a copy constructor that accepts 1 argument, an Elevator object. It
       makes a copy of the Elevator object that is passed to it. */
    
    public Elevator (String name)
    {
        this.name = name;
        floor = 1;
    }
    
    public Elevator (Elevator object2)
    {
        name = object2.name;
        floor = object2.floor;
    }
    
    // METHODS (5)
    
    /* goUp is a void method that has no arguments. It increases the floor field by 1. The floor field
       cannot be a value bigger than 10. No error action is needed. The elevator will just stay at floor 10
       if goUp is called to go higher than 10. */
    
    public void goUp()
    {
        floor += 1;
        
        if (floor > 10)
        {
            floor = 10;
        }
    }
    
    /* goDown is a void method that has no arguments. It decreases the floor field by 1. The floor
       field cannot be a value less than 1. No error action is needed. The elevator will just stay at floor 1
       if goDown is called to go lower than 1. */
    
    public void goDown()
    {
        floor -= 1;
        
        if (floor < 1)
        {
            floor = 1;
        }
    }
    
    /* showFloor is a value-returning method that has no arguments. It returns the floor where the
       elevator is as an int value. */
    
    public int showFloor()
    {
        return floor;
    }
    
    /* equals. It is a value-returning method that has an argument that is an Elevator object. It returns
       the boolean value true if the two objects are on the same floor. Otherwise, it returns false. */
    
    public boolean equals(Elevator object2)
    {
        boolean status = false;
        
        if (floor == object2.floor)
        {
            status = true;
        }
        
        return status;
    }
    
    /* toString. It is a value-returning method that has no arguments. It returns a String containing the
       field names with their values, each on a separate line. */
    public String toString()
    {
        String info;
        info = String.format("Name: %s\nFloor: %d\n", name, floor);
        
        return info;
    }      
}
