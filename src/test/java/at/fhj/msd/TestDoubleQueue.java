package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * TestDoubleQueue tests the DoubleQueue class.
 * @author marinsekic
 */

public class TestDoubleQueue {
    private DoubleQueue doubleQueue;

    /**
     * setUp creates a new doubleQueue object with an empty List (maxSize = 1) in it, before each test case.
     */
    @BeforeEach
    public void setUp(){
        doubleQueue = new DoubleQueue(1);
    }

    /**
     * testOffer1 asserts, that the offer method of doubleQueue returns true, if a testDouble is handed over as parameter.
     */
    @Test
    public void testOffer1(){
        Double testDouble = 1.5;
        Assertions.assertTrue(doubleQueue.offer(testDouble));
    }

    /**
     * testOffer2 asserts, that the offer method of doubleQueue returns false, if a testDouble is handed over as parameter, if the list is full (testDouble is added before assert method at max size 1).
     */
    @Test
    public void testOffer2(){
        Double testDouble = 1.5;
        doubleQueue.offer(testDouble);
        Assertions.assertFalse(doubleQueue.offer(testDouble));
    }

    /**
     * testPoll1 asserts, that the poll method of doubleQueue returns null, because the list in doubleQueue is empty.
     */
    @Test
    public void testPoll1(){
        Assertions.assertNull(doubleQueue.poll());
    }

    /**
     * testPoll2 asserts, that the poll method of doubleQueue returns one object as double, because the list in doubleQueue is not empty (one object is added with offer method of doubleQueue before the assertion).
     */
    @Test
    public void testPoll2(){
        Double testDouble = 1.5;
        doubleQueue.offer(testDouble);
        Assertions.assertEquals(testDouble,doubleQueue.poll());
    }

    /**
     * testRemove1 adds a testDouble to the list in doubleQueue. After this the remove method of doubleQue removes this double from the list and returns it to make the assertion.
     */
    @Test
    public void testRemove1(){
        Double testDouble  = 1.5;
        doubleQueue.offer(testDouble);
        Assertions.assertEquals(testDouble,doubleQueue.remove());
    }

    /**
     * testRemove2 asserts the exception throw. Because the remove method of doubleQueue wants to remove a Double from the list, which is empty, the exception is thrown.
     */
    @Test
    public void testRemove2(){
        assertThrows(NoSuchElementException.class, () -> doubleQueue.remove());
    }

    /**
     * testPeek1 adds a Double to the list in doubleQueue and is returned with peek. Finally, it is asserted, that it works.
     */
    @Test
    public void testPeek1(){
        Double testDouble = 1.5;
        doubleQueue.offer(testDouble);
        Assertions.assertEquals(testDouble,doubleQueue.peek());
    }

    /**
     * testPeek2 asserts, that the method peek of doubleQueue returns null, because there is no Double in the list of doubleQueue.
     */
    @Test
    public void testPeek2(){
        Assertions.assertNull(doubleQueue.peek());
    }

    /**
     * testElement1 adds a Double to the list in doubleQueue and is returned with peek. Finally, it is asserted, that it works.
     */
    @Test
    public void testElement1(){
        Double testDouble = 1.5;
        doubleQueue.offer(testDouble);
        Assertions.assertEquals(testDouble,doubleQueue.element());
    }

    /**
     * testElement2 asserts, that the method peek of doubleQueue throws an exception, because there is no Double in the list of doubleQueue.
     */
    @Test
    public void testElement2(){
        assertThrows(NoSuchElementException.class, () -> doubleQueue.element());
    }


}
