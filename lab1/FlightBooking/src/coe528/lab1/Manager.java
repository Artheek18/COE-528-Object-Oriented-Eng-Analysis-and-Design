/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;
import java.util.ArrayList;
/*
 *
 * @author a24shanm
 */
public class Manager {
    ArrayList<Flight> flight = new ArrayList<Flight>();
    Ticket ticket;
    // Flights that are added into the arraylist
    public void createFlights(){
        
        flight.add(new Flight(113, "London", "Tokyo", "Jan 11th, 2020",300, 1100));
        flight.add(new Flight(127, "Paris", "Toronto", "March 30th, 2020",230, 1450));
        flight.add(new Flight(189, "Vancouver", "New York", "Feb 12th, 2020",175 , 890));
        flight.add(new Flight(202, "Beijing", "Moscow", "Oct 25th, 2020",450 , 1290));

    }
    /* This prints out the available flights
    from the Arraylist that is called in the main method
    
    */
    public void displayAvailableFlight(String origin, String destination){
        for(Flight f: this.flight){
            if(f.getnumberOfSeatsLeft() > 0 && f.getOrigin().equals(origin) && f.getDestination().equals(destination) ){
                System.out.println(f.toString());
            }
           
            
            
        }
    }
    
    // This return the flight number of the plane
    public Flight getFlight(int flightNumber){
       for(Flight f: this.flight){
        if(flightNumber == f.getFlightNumber()){
            return f;
            
        }
        
       }
        return null;
        
    }
    /*This method will look at the flightNumber
    and validate if its true.
    This would generate a ticket which
    has their name and price.
    
    
    */
    public void bookSeat(int flightNumber, Passenger p){
       
       for(Flight f : this.flight){
           boolean validate = f.bookASeat(flightNumber);
           if(flightNumber == f.getFlightNumber() && validate == true){
            double price = p.applyDiscount(f.getOriginalPrice());
              ticket = new Ticket(price, p, f);
              System.out.println(ticket.toString());
               
           }
          
           
       }
        
        
    }
    
    public static void main(String []args){
      Manager m = new Manager(); 
       /* These passenger objects have a parent child relationship
        *where the passenger object can take member 
        *or nonmember propertes
        */
      Passenger Kevin = new Member("Kevin Armstrong",20, 2);
      Passenger Victor = new NonMember("Victor Dipole", 72);
      Passenger Gianna = new NonMember("Gianna Lo", 21);
      Passenger Louis = new Member("Louis Hay", 42 , 12);
      
      /* Using the manager object
      I will call the methods made in the manager class
      and print them out.
      The bookseat method that is called 
      will print out the ticket 
      of the passenger.
      */
      m.createFlights();
      m.displayAvailableFlight("Paris", "Toronto");
      m.displayAvailableFlight("London", "Tokyo");
      
     // this won't print out since it's not part of the arrayList
      m.displayAvailableFlight("London", "Toronto");
      System.out.print(m.getFlight(127)+"\n");
      m.bookSeat(127, Louis);
      m.bookSeat(113, Kevin);
 
    
    
    
    }
}
