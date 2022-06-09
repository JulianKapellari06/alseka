package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * TestStringQueue tests the StringQueue class.
 * @author marinsekic
 */

public class TestStringQueue {
    private StringQueue stringQueue;

    /**
     * setUp creates a new stringQueue object with an empty List (maxSize = 1) in it, before each test case.
     */
    @BeforeEach
    public void setUp(){
        stringQueue = new StringQueue(1);
    }

    /**
     * testOffer1 asserts, that the offer method of stringQueue returns true, if a testString is handed over as parameter.
     */
    @Test
    public void testOffer1(){
        String testString = "testString";
        Assertions.assertTrue(stringQueue.offer(testString));
    }

    /**
     * testOffer2 asserts, that the offer method of stringQueue returns false, if a testString is handed over as parameter, if the list is full (testSttring is added before assert method at max size 1).
     */
    @Test
    public void testOffer2(){
        String testString = "testString";
        stringQueue.offer(testString);
        Assertions.assertFalse(stringQueue.offer(testString));
    }

    /**
     * testPoll1 asserts, that the poll method of stringQueue returns null, because the list in stringQueue is empty.
     */
    @Test
    public void testPoll1(){
        Assertions.assertNull(stringQueue.poll());
    }

    /**
     * testPoll2 asserts, that the poll method of stringQueue returns one object as string, because the list in stringQueue is not empty (one object is added with offer method of stringQueue before the assertion).
     */
    @Test
    public void testPoll2(){
        String testString = "testString";
        stringQueue.offer(testString);
        Assertions.assertEquals(testString,stringQueue.poll());
    }

    /**
     * testRemove1 adds a testString to the list in stringQueue. After this the remove method of stringQue removes this string from the list and returns it to make the assertion.
     */
    @Test
    public void testRemove1(){
        String testString  = "testString";
        stringQueue.offer(testString);
        Assertions.assertEquals(testString,stringQueue.remove());
    }

    /**
     * testRemove2 asserts the exception throw. Because the remove method of stringQueue wants to remove a String from the list, which is empty, the exception is thrown.
     */
    @Test
    public void testRemove2(){
        assertThrows(NoSuchElementException.class, () -> stringQueue.remove());
    }

    /**
     * testPeek1 adds a String to the list in stringQueue and is returned with peek. Finally, it is asserted, that it works.
     */
    @Test
    public void testPeek1(){
        String testString = "testString";
        stringQueue.offer(testString);
        Assertions.assertEquals(testString,stringQueue.peek());
    }

    /**
     * testPeek2 asserts, that the method peek of stringQueue returns null, because there is no String in the list of stringQueue.
     */
    @Test
    public void testPeek2(){
        Assertions.assertNull(stringQueue.peek());
    }

    /**
     * testElement1 adds a String to the list in stringQueue and is returned with peek. Finally, it is asserted, that it works.
     */
    @Test
    public void testElement1(){
        String testString = "testString";
        stringQueue.offer(testString);
        Assertions.assertEquals(testString,stringQueue.element());
    }

    /**
     * testElement2 asserts, that the method peek of stringQueue throws an exception, because there is no String in the list of stringQueue.
     */
    @Test
    public void testElement2(){
        assertThrows(NoSuchElementException.class, () -> stringQueue.element());
    }

}
