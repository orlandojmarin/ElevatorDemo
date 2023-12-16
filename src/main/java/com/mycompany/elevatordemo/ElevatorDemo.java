/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elevatordemo;

/**
 *
 * @author orlandomarin
 */
public class ElevatorDemo {

    public static void main(String[] args) 
    {
        // create an Elevator object named elevatorNorthEast
        Elevator elevatorNorthEast = new Elevator("Elevator Northeast");
        
        // create an Elevator object named elevatorSouthWest
        Elevator elevatorSouthWest = new Elevator("Elevator Southwest");
        
        // put elevatorNorthEast on the 3rd floor and display what floor it's on
        elevatorNorthEast.goUp();
        elevatorNorthEast.goUp();
        elevatorNorthEast.goUp();
        elevatorNorthEast.goDown();
        
        System.out.println("The Northeast elevator is on floor " + elevatorNorthEast.showFloor());
        
        // put elevatorSouthWest on the 2nd floor and display what floor it's on
        elevatorSouthWest.goUp();
        elevatorSouthWest.goUp();
        elevatorSouthWest.goUp();
        elevatorSouthWest.goDown();
        elevatorSouthWest.goDown();
        
        System.out.println("The Southwest elevator is on floor " + elevatorSouthWest.showFloor());
        
        // call toString implicitly for both elevators (elevatorNorthEast and elevatorSouthWest)
        System.out.println("\nInfo for the Northeast elevator");
        System.out.println(elevatorNorthEast);
        
        System.out.println("Info for the Southwest elevator");
        System.out.println(elevatorSouthWest);
        
        // call equals to see if these two elevators (elevatorNorthEast and elevatorSouthWest) are equal. They are equal if they are on the same floor.
        if (elevatorNorthEast.equals(elevatorSouthWest))
        {
            System.out.println("The Northeast and Southwest elevators are on the same floor of the hotel, Orlando Marin!");
        }
        else 
        {
            System.out.println("The Northeast and Southwest elevators are NOT on the same floor of the hotel, Orlando Marin!");
        }
        
        // create a copy of elevatorNorthEast using the copy constructor and call it elevatorNorthWest
        Elevator elevatorNorthWest = new Elevator(elevatorNorthEast);
        
        // call toString implicitly for elevatorNorthWest. It should have the same name and floor as elevatorNorthEast.
        System.out.println("\nInfo for the Northwest elevator");
        System.out.println(elevatorNorthWest);
        
        // call equals to see if elevators elevatorNorthEast and elevatorNorthWest are equal
        if (elevatorNorthEast.equals(elevatorNorthWest))
        {
            System.out.println("The Northeast and Northwest elevators are on the same floor of the hotel, Orlando Marin!");
        }
        else 
        {
            System.out.println("The Northeast and Northwest elevators are NOT on the same floor of the hotel, Orlando Marin!");
        }
    }
}
