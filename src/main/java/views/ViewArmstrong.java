package views;

import java.util.Scanner;

import controller.ControllerProgram;


public class ViewArmstrong {
    private static Scanner scanner =  new Scanner(System.in);

    private static final String RESET = "\033[0m"; 
    private static final String GREEN = "\033[32m"; 
     
    
    public ViewArmstrong(){
        
    }

    public static void index(){  
              
        System.out.println("| " + GREEN +"     Introduzca el número:          "+ RESET + "|");  
        System.out.println(" -------------------------------------");       
        Integer number = scanner.nextInt();         
        getArmstrong(number);
    }


    public static void getArmstrong(Integer num){
        ControllerProgram.verifyNumberArmstrong(num);   
    }



    public static void renderNumber(Integer number, Boolean result){
        
        System.out.println("El número: " + number + (result ? " es Armstrong" : " no es Armstrong"));       
        
    }

}
