package views;

import java.util.Scanner;



public class ViewArmstrong {
    private Scanner scanner;
    
    public ViewArmstrong(){
        this.scanner = new Scanner(System.in);
    }

    public int index(){         
        System.out.println("Introduzca el número");        
        return scanner.nextInt();         
        
    }

    public void renderNumber(Integer number, Boolean result){
        
        System.out.print("El número: "+ number + " ");       
        if(result){
            System.out.println("es Armstrong");
        }
        else
        {
            System.out.println("no es Armstrong");
        }
    }

}
