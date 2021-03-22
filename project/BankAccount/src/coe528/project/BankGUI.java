/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package coe528.project;

import javafx.application.Application;
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
/**
 *
 * @author a24shanm
 */
public class BankGUI extends Application{ 
        
   
        
    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane layout = new StackPane();
        Button bank = new Button("Start");
        layout.getChildren().add(bank);
        Scene scene = new Scene(layout, 900, 1000);
        primaryStage.setTitle("Bank Account");
        primaryStage.setScene(scene);
        
        primaryStage.show();
        
    }
    
     public static void main(String[] args){
      launch(args);

  }
    
    
}
