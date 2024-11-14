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
              
        System.out.println("| " + GREEN+"     Introduzca el número:          "+ RESET + "|");  
        System.out.println(" -------------------------------------");       
        Integer number = scanner.nextInt();         
        getAstrom(number);
    }


    public static void getAstrom(Integer num){
        ControllerProgram.verifyNumberArmstrong(num);     

    }



    public static void renderNumber(Integer number, Boolean result){
        
                        
        if(result){
            System.out.println(" El número: "+ number + " es Armstrong");
            
        }
        else
        {
            System.out.println(" El número: "+ number + " no es Armstrong");
            
        }
        
    }

}
