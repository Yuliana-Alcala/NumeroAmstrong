package controller;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ControllerProgramTest {
     private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @Test
    public void testVerifyNumberArmstrong() {
        
        Integer testNumber = 153; 
        
        ControllerProgram.verifyNumberArmstrong(testNumber);

        String expectedResult = "El número: 153 es Armstrong"; 

        assertEquals(expectedResult, outputStreamCaptor.toString().trim());      
        
    }

    @Test
    public void testVerifyNumberNotArmstrong() {
        
        Integer testNumber = 351; 
        
        ControllerProgram.verifyNumberArmstrong(testNumber);

        String expectedResult = "El número: 351 no es Armstrong";

        assertEquals(expectedResult, outputStreamCaptor.toString().trim());
            
    }
}
