/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author a24shanm
 */
public class Member extends Passenger {
    //instance variable
    private int yearsOfMembership;
    public Member(String name, int age, int yearsOfMembership) {
        super(name, age);
         this.yearsOfMembership = yearsOfMembership;
        
    }
    
     @Override
    public double applyDiscount (double p)
    {
        if (yearsOfMembership > 5)
        {
           // 50% discount on the ticket
            return (p*0.5);
        } 
        else if(yearsOfMembership < 5 || yearsOfMembership  > 1){
            
            return (p*0.9);
            
        }
        else 
            
          return p;
    }       
        
    
}
