/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab3;

/**
 *
 * @author a24shanm
 */

import java.util.ArrayList;

public class StackOfDistinctStrings {
    
    
// Overview: StacksOfDistinctStrings are mutable, bounded         
// collection of distinct strings that operate in      
// LIFO (Last-In-First-Out) order.      
//     
// The abstraction function is:    
// a)Write the abstraction function here    
//   
//  AF(C) = a stack containing a list of Strings under variable, String c
//    c.top = c.items(i) where i is the last index containing a string
//    c.bot = c.items(0) where 0 is the first index containg the first string
//  pop removes strings while push adds strings
//    
//    
// The rep invariant is:    
// b)Write the rep invariant here   
//   
//   R(c) = Returns true if
//     StringList contains unique strings that aren't empty or null
//   else 
// returns false
    
//the rep     
 private ArrayList<String> items;     
// constructor     
 public StackOfDistinctStrings() {         
// EFFECTS: Creates a new StackOfDistinctStrings object         
        items = new ArrayList<String>();     
    }
    
 
 
 public void push(String element) throws Exception {         
// MODIFIES: this        
// EFFECTS: Appends the element at the top of the stack          
//          if the element is not in the stack, otherwise         
//          does nothing.         
     if(element == null) throw new Exception();         
     if(false == items.contains(element))              
             items.add(element);    
        }
 
 
 public String pop() throws Exception {        
// MODIFIES: this         
// EFFECTS: Removes an element from the top of the stack         
      if (items.size() == 0) throw new Exception();         
       return items.remove(items.size()-1);     
       
    }
 
 public boolean repOK() {         
// EFFECTS: Returns true if the rep invariant holds for this            
//          object; otherwise returns false    
// c) Write the code for the repOK() here


    boolean repOk = false;
    if(items == null || items.size() == 0){
        return repOk;
    }
    
    for(int i = 0; i < items.size(); i++){
        if( items.get(i) instanceof String == false){
            return repOk;
        }
        
        for(int j = i+1; j < items.size(); j++){
             if( items.get(i).equals(items.get(j))){
                 return repOk;
             }
        }
        
    }

    return true;
 }  
 
 @Override
 public String toString() {        
 // EFFECTS: Returns a string that contains the strings in the        
  //          stack and the top element. Implements the         
//          abstraction function.   
// d) Write the code for the toString() here     
 
    String p = " ";
    for(int index = 0; index < items.size(); index++){
        
        p += " " + items.get(index);
    }
    
   return p; 
 }
 
 
 public static void main(String args[]){
  
    StackOfDistinctStrings p = new StackOfDistinctStrings();
     
  
     
    System.out.println( p.toString() );
     
 }
    
    
}
