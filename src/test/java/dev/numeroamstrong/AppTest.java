package dev.numeroamstrong;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        // Redirigimos la salida estándar para capturar el resultado
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testAppMainOutput() {
       
        App.main(new String[]{});

  
        String expectedOutput = "Verificar si un número es Armstrong";

        
        assertTrue(outputStreamCaptor.toString().contains(expectedOutput));
    }
}