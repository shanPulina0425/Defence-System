/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import interfaces.Observable;
import view.Helicopter;
import view.Submarine;
import view.Tank;

/**
 *
 * @author shanp
 */
public class controller extends javax.swing.JFrame {
//    private ArrayList<Observable> observables =new ArrayList<>();
    
   
    
    private Observable[] observables=new Observable[0];
    
    public void addObservables(Observable observable){
        Observable[] tempobservable=new Observable[observables.length+1];
        
        for(int i=0;i<observables.length;i++){
            tempobservable[i]=observables[i];
        
        }
        
        tempobservable[tempobservable.length-1]=observable;
        observables=tempobservable;
    
    }
    
     public void sendMessage(String message){
         
         for(Observable observable:observables){
             
             observable.setMessage(message);
         
         }
     
     }
     
     public void sendMessagePrivate(String combatVehicle,String message){
         
         
         
             
             for (Observable observable : observables) {
                 if (combatVehicle.equals("Tank") && observable instanceof Tank) {
                     observable.setMessage(message);
                     return;
                 } else if (combatVehicle.equals("Submarine") && observable instanceof Submarine) {
                     observable.setMessage(message);
                     return;
                 } else if (combatVehicle.equals("Helicopter") && observable instanceof Helicopter) {
                     observable.setMessage(message);
                     return;
                 }

            }
             
            
        
    
         
         
     
     }
    
}
