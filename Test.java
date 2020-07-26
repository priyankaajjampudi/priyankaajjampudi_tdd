package tdd;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class Test
{
    /**
     * Rigorous Test :-)
     * 1. AB => B
     * 2. BACD => BCD
     * 3. A =>
     * 4. AACA => CA
     * 5. BCAA => BCAA
     * 6. " " => " "
     */

    Method removeFirst2AChars;

    @BeforeEach
    public void setUp() {
        removeFirst2AChars = new Method();
    }

    @Test
    public void test1Case() {
        String actual = removeFirst2AChars.remove("AB");
        assertEquals("B", actual);
    }

    @Test
    public void test2Case() {
        String actual = removeFirst2AChars.remove("BACD");
        assertEquals("BCD", actual);
    }

    @Test
    public void test3Case() {
        String actual = removeFirst2AChars.remove("A");
        assertEquals("", actual);
    }

    @Test
    public void test4Case() {
        String actual = removeFirst2AChars.remove("AACA");
        assertEquals("CA", actual);
    }

    @Test
    public void test5Case() {
        String actual = removeFirst2AChars.remove("BCAA");
        assertEquals("BCAA", actual);
    }

}

