package dev.numeroamstrong;

import javax.swing.text.View;

import controller.ControllerProgram;
import models.ModelNumber;
import models.ModelNumberArmstrong;
import views.ViewArmstrong;


/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
      
        System.out.println(" -------------------------------------");
        System.out.println("| Verificar si un número es Armstrong |");
        System.out.println(" -------------------------------------");
        ControllerProgram controller = new ControllerProgram();        
        controller.startProgram(); 
              
    
    }
}
