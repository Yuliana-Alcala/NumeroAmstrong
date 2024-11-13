package controller;

import models.ModelNumber;
import models.ModelNumberArmstrong;
import views.ViewArmstrong;

public class ControllerProgram {

    private ViewArmstrong view;    
    private ModelNumberArmstrong modelArmstrong;
    
    
    public ControllerProgram(ViewArmstrong view, ModelNumberArmstrong modelArmstrong) {
        
        this.view = view;    
        this.modelArmstrong = modelArmstrong; 
        
    }

    // Constructor sin parámetros para utilizar en el App y no repetir lineas 32,33 creando parametros en App tambien
    public ControllerProgram() {
        this.view = new ViewArmstrong();        
        
        ModelNumber modelNumber = new ModelNumber(1); 
        this.modelArmstrong = new ModelNumberArmstrong(modelNumber);
    }

    public void startProgram(){
        Integer number = view.index();

        ModelNumber modelNumber = new ModelNumber(number);
        modelArmstrong = new ModelNumberArmstrong(modelNumber);

        Boolean result = modelArmstrong.calculateIfArmstrongNumber();
                      
        view.renderNumber(number,result);       
          
    } 


}
