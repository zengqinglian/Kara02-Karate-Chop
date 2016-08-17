package kata.eric.zeng;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
    
    private BinarySearch<Integer> searchEngine;
    
    @Before
    public void setUp(){
        searchEngine = new BinarySearch<>();
    }
    
    @Test
    public void testSearchRecursive() {
        Integer[] sortedNums_1 = {};
        assertEquals(searchEngine.chopRecursion(sortedNums_1, 1), -1);
        Integer[] sortedNums_2 = { 1 };
        assertEquals(searchEngine.chopRecursion(sortedNums_2, 1), 0);
        assertEquals(searchEngine.chopRecursion(sortedNums_2, 2), -1);
        Integer[] sortedNums_3 = { 1, 2 };
        assertEquals(searchEngine.chopRecursion(sortedNums_3, 3), -1);
        assertEquals(searchEngine.chopRecursion(sortedNums_3, 1), 0);
        assertEquals(searchEngine.chopRecursion(sortedNums_3, 2), 1);

        Integer[] sortedNums_4 = { 1, 2, 3 };
        assertEquals(searchEngine.chopRecursion(sortedNums_4, 4), -1);
        assertEquals(searchEngine.chopRecursion(sortedNums_4, 1), 0);
        assertEquals(searchEngine.chopRecursion(sortedNums_4, 2), 1);
        assertEquals(searchEngine.chopRecursion(sortedNums_4, 3), 2);

        Integer[] sortedNums_5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(searchEngine.chopRecursion(sortedNums_5, 2), 1);
        assertEquals(searchEngine.chopRecursion(sortedNums_5, 7), 6);
        assertEquals(searchEngine.chopRecursion(sortedNums_5, 9), 8);
        assertEquals(searchEngine.chopRecursion(sortedNums_5, 16), -1);
    }
}
