package views;

import java.util.Scanner;



public class ViewArmstrong {
    private Scanner scanner;

    private static final String RESET = "\033[0m"; 
    private static final String GREEN = "\033[32m"; 
    private static final String RED = "\033[31m"; 
    
    public ViewArmstrong(){
        this.scanner = new Scanner(System.in);
    }

    public int index(){  
              
        System.out.println("|      Introduzca el número:          |");  
        System.out.println(" -------------------------------------");       
        return scanner.nextInt();         
        
    }

    public void renderNumber(Integer number, Boolean result){
        
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
