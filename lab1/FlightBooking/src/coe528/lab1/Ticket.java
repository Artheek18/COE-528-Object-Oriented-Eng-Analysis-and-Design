/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author a24shanm
 * Artheeckkumarran Shanmugalingam
 * 500895150
 */
public class Ticket {
    //instance variables
    private double price;
    private Passenger passenger;
    private Flight flight;
    private static int ticketNumber;
    
    
    
    public Ticket(double price, Passenger passenger, Flight flight){
        this.price = price;
        this.passenger = passenger;
        this.flight = flight;
        
        
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the passenger
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * @param passenger the passenger to set
     */
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    /**
     * @return the flight
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * @param flight the flight to set
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    
    @Override
    public String toString(){
        
        return passenger.getName() + ", "+ "Flight " + flight.getFlightNumber() + ", " + flight.getOrigin() + " to " + flight.getDestination() + ", " + flight.getDepartureTime() + ", original price: $" + flight.getOriginalPrice() + ", price: $" + this.price;
     
    }
    
}
