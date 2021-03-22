/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author a24shanm
 * 500895150
 * Artheeckkumarran Shanmugalingam
 */
public class Flight {
    //instance variables
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice){
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        numberOfSeatsLeft = capacity;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        
        if(this.origin.equals(this.destination) ){
            
            throw new IllegalArgumentException("The origin and destination are the same. ");
            
        }
       
    }
    
    
    public boolean bookASeat(int capacity){
        if(numberOfSeatsLeft > 0){
           numberOfSeatsLeft--;
           return true;
          
        }
        else
            return false;
        
        
    } 
    
   
    
    @Override
    public String toString(){
       
      return "Flight " + this.flightNumber + ", " + this.origin + " to " + this.destination + ", " + this.departureTime + ", original price: $" + this.originalPrice;
        
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
    
    
    
    public int getnumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public void setnumberOfSeatsLeft(int numberOfSeatsLeft) {
        numberOfSeatsLeft = capacity;
    }
    
    
    
    
}
