package dev.numeroamstrong;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
       
        System.setOut(new PrintStream(outputStreamCaptor));
    }
     @Test
    public void testAppMainOutput() {
        // Ejecutamos el método main de la clase App
        App.main(new String[]{});

        // El mensaje esperado que debe aparecer en la salida estándar
        String expectedOutput = "Verificar si un número es Armstrong";

        // Verificamos que la salida contiene el mensaje esperado
        assertTrue(outputStreamCaptor.toString().contains(expectedOutput));
         

        String controllerMessage = "ControllerProgram instance created";
       assertTrue(outputStreamCaptor.toString().contains(controllerMessage));
        
    }

    
}