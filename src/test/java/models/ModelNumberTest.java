package models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class ModelNumberTest {
    @Test
    void testGetNumber() {
        ModelNumber modelNumber = new ModelNumber(153);

        assertThat(modelNumber.getNumber(),is(153));



    }
}
