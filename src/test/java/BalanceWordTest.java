import org.example.BalanceWordCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BalanceWordTest {
    @Test
    public void count_NormalLetters_28(){
        int count = BalanceWordCounter.count("aabbabcccba");
        int expectedCount = 28;
        assertEquals(expectedCount,count);
    }
    @Test
    public void count_EmptyString_0(){
        int count = BalanceWordCounter.count("");
        int expectedCount = 0;
        assertEquals(expectedCount,count);
    }
    @Test
    public void count_LettersWithNumber_RuntimeException(){
        assertThrows(RuntimeException.class, ()->{
            int count = BalanceWordCounter.count("abababa1");
        });
    }
    @Test
    public void count_Null_RuntimeException(){
        assertThrows(RuntimeException.class, ()->{
            int count = BalanceWordCounter.count(null);
        });
    }
}
