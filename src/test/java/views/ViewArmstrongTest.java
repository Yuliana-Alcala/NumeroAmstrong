package views;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ViewArmstrongTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testGetAstrom() {
        Integer num = 153; // Número de prueba

        // Llamamos al método getAstrom, que invoca ControllerProgram.verifyNumberArmstrong
        ViewArmstrong.getAstrom(num);

        // Comprobamos si la salida contiene el mensaje esperado
        String expectedOutput = "El número: 153 es Armstrong";
        assertTrue(outputStreamCaptor.toString().contains(expectedOutput),expectedOutput);
    }

    @Test
    void testRenderNumber() {
        Integer num = 153; 
        Boolean response = true; 

       
        ViewArmstrong.renderNumber(num, response);

        
        String expectedOutput = "El número: 153 es Armstrong";
        assertTrue(outputStreamCaptor.toString().contains(expectedOutput), 
        expectedOutput);
    }
}
