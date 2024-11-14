package models;

public class ModelNumberArmstrong {


    public ModelNumberArmstrong() {
        
     
    }

    public static Boolean calculateIfArmstrongNumber(Integer numberVerify){
             
        Integer numberOfDigits = 0;
        Integer digit = 0;
        Integer suma = 0;
        Integer numberTemp = numberVerify;
        Boolean result;

        if(numberVerify < 0){
            numberOfDigits = Integer.toString(numberVerify).length()-1;

        }else{
            numberOfDigits = Integer.toString(numberVerify).length();
        }
        
        
        for (int index = 0 ; index < numberOfDigits; index++){
            digit = numberTemp % 10;
            suma += (int)Math.pow(digit, numberOfDigits); 
            numberTemp /= 10; 
        }
          
        if (suma.equals(numberVerify)) {
            result = true;
        } else {
            result = false;
        }         
        
        return result;
    } 
}
