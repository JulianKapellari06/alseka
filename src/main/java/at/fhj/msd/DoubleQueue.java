package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * DrinksQueue represents a double list
 * @author Marin Sekic
 */
public class DoubleQueue implements IQueue{

    /**
     *  the menu and its size/length
     */
    private List<Double> elements = new ArrayList<Double>();
    private int maxSize;


    /**
     * DoubleQueue(int maxSize): constructor of the Double list
     * @param maxSize determinants the amount of drinks in the list
     */
    public DoubleQueue(int size){
        this.maxSize = size;
    }


    /**
     * adds a Double to the menu
     * @param obj is data type Object, in order to add different types of data to the list
     * @return true or false, true if a double could be added successfully
     * @author Marin Sekic
     */
    @Override
    public boolean offer(Object obj) {
        if (elements.size() != maxSize)
            elements.add((Double) obj);
        else
            return false;

        return true;
    }

    /**
     * gets the first double in the menu and then removes it from menu/list
     * @return null if there is no double in the list, the first double as element if there is
     * any doubles in list
     * @author Marin Sekic
     */
    @Override
    public Object poll() {
        Double element = (Double) peek();
        if (element != null) {
            elements.remove(element);
            return element;
        } else {
            return null;
        }
    }

    /**
     * gets the first double in the menu and then removes it from menu/list
     * @return NoSuchElementException if there is no double in the list, the first double as element if there is
     * any doubles in list
     * @author Marin Sekic
     */
    @Override
    public Object remove() {
        Double element = (Double) peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        elements.remove(element);
        return element;
    }

    /**
     * gets the first double in the menu and then removes it from list
     * @return Null if there is no double in the list, the first double as element if there is
     * any doubles in list
     * @author Marin Sekic
     */

    @Override
    public Object peek() {
        Double element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    /**
     * gets the first double in the menu and then removes it from list
     * @return NoSuchElementException if there is no double in the list, the first double as element if there is
     * any doubles in list
     * @author Marin Sekic
     */

    @Override
    public Object element() {
        Double element = (Double) peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
