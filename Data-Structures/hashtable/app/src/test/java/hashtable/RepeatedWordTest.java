package hashtable;
import RepeatedWord.RepeatedWord;
import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedWordTest {
    @Test public void testRepeatedWordMethodForEmptyString(){
        assertEquals("Test Repeated Word Method For Empty String","", RepeatedWord.getFirstRepeatedWord(""));
    }

    @Test public void testRepeatedWordMethodForStringWithoutRepeatedWord(){
        assertEquals("Test Repeated Word Method For String Without Repeated Word","", RepeatedWord.getFirstRepeatedWord("abcdefg"));
    }

    @Test public void testRepeatedWordMethodForStringWithMoreThanOneRepeatedWord(){
        assertEquals("Test Repeated Word Method For String With More Than One Repeated Word","areej", RepeatedWord.getFirstRepeatedWord("areej and areej and ..."));
    }

    @Test public void testRepeatedWordMethodForStringWithOneRepeatedWord(){
        assertEquals("Test Repeated Word Method For String With One Repeated Word","areej", RepeatedWord.getFirstRepeatedWord("areej and areej"));
    }

    @Test public void TestRepeatedWordMethodForStringWithLastWordAsRepeatedWord(){
        assertEquals("Test Repeated Word Method For String With Last Word As Repeated Word","areej", RepeatedWord.getFirstRepeatedWord("areej and areej"));
    }

    @Test public void TestRepeatedWordMethodForStringWithFirstWordAsRepeatedWord(){
        assertEquals("Test Repeated Word Method For String With First Word As Repeated Word","areej", RepeatedWord.getFirstRepeatedWord("areej and areej"));
    }

    @Test public void TestRepeatedWordMethodForStringWithBesideRepeatedWords(){
        assertEquals("Test Repeated Word Method For String With Beside Repeated Word","areej", RepeatedWord.getFirstRepeatedWord("areej areej"));
    }

    @Test public void TestRepeatedWordMethodForStringWithNotBesideRepeatedWords(){
        assertEquals("Test Repeated Word Method For String With Beside Repeated Word","areej", RepeatedWord.getFirstRepeatedWord("areej and areej"));
    }
}
