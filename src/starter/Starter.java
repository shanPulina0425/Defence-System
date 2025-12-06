/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starter;

import view.Helicopter;
import view.MainController;
import view.Submarine;

/**
 *
 * @author shanp
 */
public class Starter {
    
    public static void main(String[] args){
        
        MainController mainController=new MainController();
        
        Helicopter helicopter=new Helicopter(mainController);
        Submarine submarine=new Submarine(mainController);
        
        
        mainController.addObservables(helicopter);
        mainController.addObservables(submarine);
        
        
        
        
        mainController.setVisible(true);
        helicopter.setVisible(true);
        submarine.setVisible(true);
        
    
    }
     
    
    
}
