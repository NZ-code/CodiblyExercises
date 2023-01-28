import org.example.BubbleSort;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void sort_IntegerNums_SortedIntegerNums(){
        List<Comparable> input =  new ArrayList<>(Arrays.asList(1,4,5,6,8,3,8));
        List<Comparable> expectedOutput =  new ArrayList<>(Arrays.asList(1,3,4,5,6,8,8));
        var output = BubbleSort.sort(input);
        assertEquals(expectedOutput,output);
    }
    @Test
    public void sort_DoubleNums_SortedDoubleNums(){
        List<Comparable> input =  new ArrayList<>(Arrays.asList(-9.3,0.2,4.0,0.1,5.0,9.0));
        List<Comparable> expectedOutput =  new ArrayList<>(Arrays.asList(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0));
        var output = BubbleSort.sort(input);
        assertEquals(expectedOutput,output);
    }
    @Test
    public void sort_Empty_Empty(){
        List<Comparable> input =  new ArrayList<>(Arrays.asList());
        List<Comparable> expectedOutput =  new ArrayList<>(Arrays.asList());
        var output = BubbleSort.sort(input);
        assertEquals(expectedOutput,output);
    }
    @Test
    public void sort_WithNull_AvoidNull(){
        List<Comparable> input =  new ArrayList<>(Arrays.asList(null,5.0001));
        List<Comparable> expectedOutput = new ArrayList<>(Arrays.asList(5.0001));
        var output = BubbleSort.sort(input);
        assertEquals(expectedOutput,output);
    }
    @Test()
    public void sort_NullList_RuntimeException(){
        List<Comparable> input =  null;


        assertThrows(RuntimeException.class,()->{
            var output = BubbleSort.sort(input);
        });
    }
}
