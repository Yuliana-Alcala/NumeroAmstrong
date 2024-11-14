package views;

import java.util.Scanner;

import controller.ControllerProgram;




public class ViewArmstrong {
    private static Scanner scanner =  new Scanner(System.in);

    private static final String RESET = "\033[0m"; 
    private static final String GREEN = "\033[32m"; 
    private static final String RED = "\033[31m"; 
    
    public ViewArmstrong(){
        
    }

    public static void index(){  
              
        System.out.println("|      Introduzca el número:          |");  
        System.out.println(" -------------------------------------");       
        int number = scanner.nextInt();         
        getAstrom(number);
    }


    public static void getAstrom(int num){
        ControllerProgram.verifyNumberArmstrong(num);     

    }



    public static void renderNumber(Integer number, Boolean result){
        
        System.out.println(" -------------------------------------");
        System.out.print("|    El número: "+ number + " ");
        
       // System.out.print("El número: "+ number + " ");       
        if(result){
            System.out.println(GREEN +"Es Armstrong      "+ RESET+"|");
            
        }
        else
        {
            System.out.println(RED +"No es Armstrong   "+ RESET+"|");
            
        }
        System.out.println(" -------------------------------------");
    }

}
