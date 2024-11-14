package controller;


import models.ModelNumberArmstrong;
import views.ViewArmstrong;

public class ControllerProgram {

    
       
    public static void controllerProgram() {
      
    }

    public static void startProgram(){
        ViewArmstrong.index();          
          
    } 
    
    public static void verifyNumberArmstrong(Integer num){
        boolean result = ModelNumberArmstrong.calculateIfArmstrongNumber(num);
        ViewArmstrong.renderNumber(num,result);

    } 
    


}
