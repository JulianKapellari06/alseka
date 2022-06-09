package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * TestDrinksQueue tests drinks, liquids and drinks queue
 *
 * @author Kapellari Julian
 */
public class TestDrinksQueue {

    private DrinksQueue queue;
    private Liquid liquid;
    private SimpleDrink simpleDrink;

    /**
     * Creates a setup, which is needed for the tests.
     * Create a valid liquid, simple-drink and drinks-queue object
     */
    @BeforeEach
    public void setup() {
        queue = new DrinksQueue(2);

        liquid = new Liquid("Cola", 2, 0);
        simpleDrink = new SimpleDrink("CocaCola", liquid);

    }

    /**
     *  All liquid get-methods are tested without any errors.
     */
    @Test
    void testLiquid() {
        Assertions.assertEquals(0, liquid.getAlcoholPercent());
        Assertions.assertEquals("Cola", liquid.getName());
        Assertions.assertEquals(2, liquid.getVolume());
    }

    /**
     *  All liquid get-methods are tested without any errors.
     */
    @Test
    void testSimpleDrink() {
        Assertions.assertEquals(0, simpleDrink.getAlcoholPercent());
        Assertions.assertEquals("CocaCola", simpleDrink.getName());
        Assertions.assertEquals(2, simpleDrink.getVolume());
        Assertions.assertFalse( simpleDrink.isAlcoholic());
    }

    /**
     *  Adds a drink to queue and returns true, because the list isn't full.
     */
    @Test
    void testOffer() {

        Assertions.assertTrue( queue.offer(simpleDrink));

    }

    /**
     *  Fills up the list and adds one more simple-drink:
     * Returns false because list is full.
     */
    @Test
    void testOfferMax() {
        queue.offer(simpleDrink);
        queue.offer(simpleDrink);

        Assertions.assertFalse( queue.offer(simpleDrink));

    }
    /**
     *  Adds a drink to queue and removes it: The added drink should be returned.
     */
    @Test
    void testPoll() {
        queue.offer(simpleDrink);
        Assertions.assertEquals(simpleDrink, queue.poll());
    }

    /**
     *  Checks what happens after we remove first item if list is empty.
     */
    @Test
    void testPollEmpty() {
        Assertions.assertNull(queue.poll());
    }

    /**
     *  Adds a drink to queue and removes it: The added drink should be returned.
     */
    @Test
    void testRemove() {
        queue.offer(simpleDrink);
        Assertions.assertEquals(simpleDrink, queue.remove());
    }

    /**
     *  Checks what happens after we remove first item if list is empty.
     * Should throw NoSuchElementException
     */
    @Test
    void testRemoveEmpty() {
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    /**
     *  Add one simple-drink to queue. Return first element in queue without deleting it.
     */
    @Test
    void testPeek() {
        queue.offer(simpleDrink);
        Assertions.assertEquals(simpleDrink, queue.peek());
    }

    /**
     *  If queue is empty get first element in queue: Should return null
     */
    @Test
    void testPeekEmpty() {
        Assertions.assertNull(queue.peek());
    }

    /**
     *  Add one simple-drink to queue. Return first element in queue without deleting it.
     */
    @Test
    void testElement() {
        queue.offer(simpleDrink);
        Assertions.assertEquals(simpleDrink, queue.element());
    }

    /**
     *  If queue is empty get first element in queue: Should throw NoSuchElementException
     */
    @Test
    void testElementEmpty() {
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }

}
