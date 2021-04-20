package stacksandqueues;
import org.junit.Test;
import utilities.AnimalShelter;
import utilities.AnimalShelter2nSolution;
import utilities.Models.Cat;
import utilities.Models.Dog;
import utilities.MultiBracketValidation;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test public void testMultiBracketValidationEmptyString() {
        assertEquals("Test Empty String",true,MultiBracketValidation.multiBracketValidation(""));
    }

    @Test public void testMultiBracketValidationTrueCases() {
        assertEquals(true,MultiBracketValidation.multiBracketValidation("{}"));
        assertEquals(true,MultiBracketValidation.multiBracketValidation("{}(){}"));
        assertEquals(true,MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
        assertEquals(true,MultiBracketValidation.multiBracketValidation("(){}[[]]"));
        assertEquals(true,MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));
    }

    @Test public void testMultiBracketValidationFalseCases() {
        assertEquals(false,MultiBracketValidation.multiBracketValidation("[({}]"));
        assertEquals(false,MultiBracketValidation.multiBracketValidation("(]("));
        assertEquals(false,MultiBracketValidation.multiBracketValidation("{(})"));
        assertEquals(false,MultiBracketValidation.multiBracketValidation("{"));
        assertEquals(false,MultiBracketValidation.multiBracketValidation(")"));
        assertEquals(false,MultiBracketValidation.multiBracketValidation("[}"));
    }
}
