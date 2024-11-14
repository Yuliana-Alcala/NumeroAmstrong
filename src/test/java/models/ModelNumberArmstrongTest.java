package models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class ModelNumberArmstrongTest {
    @Test
    void testCalculateIfArmstrongNumber() {
        Integer number = 153;
        ModelNumber num = new ModelNumber(number);
        ModelNumberArmstrong verifyArmstrong = new ModelNumberArmstrong(num);

        Boolean result = verifyArmstrong.calculateIfArmstrongNumber();

        assertThat(result, is(true));         
        

    }
}
