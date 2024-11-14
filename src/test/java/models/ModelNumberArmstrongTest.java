package models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class ModelNumberArmstrongTest {
    @Test
    void testCalculateIfArmstrongNumber() {
        Integer number = 153;
                
        Boolean result = ModelNumberArmstrong.calculateIfArmstrongNumber(number);
        assertThat(result, is(true));         
        

    }
}
