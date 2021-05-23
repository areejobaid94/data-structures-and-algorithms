package hashtable;
import org.junit.Test;
import static org.junit.Assert.*;
public class RepeatedWordStretchGaolsTest {
    @Test public void testRepeatedWordStretchGoalsGetCountOfWords(){
        assertEquals("Test Repeated Word Stretch Goals Get Count Of Words","counts: a=>3 b=>2 c=>1 ", RepeatedWord.RepeatedWordStretchGoals.getCountOfWords("a a a b b c"));
    }

    @Test public void testRepeatedWordStretchGoalsGetMostFrequentlyUsed(){
        assertEquals("Test Repeated Word Stretch Goals Get Most Frequently Used","counts: a=>3 b=>2 ", RepeatedWord.RepeatedWordStretchGoals.getMostFrequentlyUsed("a a a b b c"));
    }
}
