package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * DrinksQueue represents a Drink menu
 * @author Marin Sekic, Julian Kappelari, Mohammed Alamer
 */
public class DrinksQueue implements IQueue{
    /**
     * the menu and its size/length
     */
    private List<Drink> elements = new ArrayList();
    private final int maxSize;

    /**
     * DrinksQueue(int maxSize): constructor of the Drink menu
     * @param maxSize determinants the amount of drinks in the menu/list
     */
    public DrinksQueue(int maxSize){
        this.maxSize = maxSize;
    }

    /**
     * adds a Drink to the menu
     * @param obj is data type Object, in order to add different types of data to the menu/list
     * @return true or false, true if a drink could be added successfully
     * @author Julian Kapellari
     */
    @Override
    public boolean offer(Object obj) {
        if (elements.size() != maxSize)
            elements.add((SimpleDrink) obj);
        else
            return false;

        return true;
    }

    /**
     * gets the first drink in the menu and then removes it from menu/list
     * @return null if there is no Drinks in the menu/queue, the first Drink as element if there is
     * any Drinks in menu/queue
     * @author Julian Kapellari
     */
    @Override
    public Object poll() {
        Object element = peek();

        if (element != null) {
            elements.remove(element);
            return element;
        } else {
            return null;
        }
    }

    /**
     * gets the first drink in the menu and then removes it from menu/list
     * @return NoSuchElementException if there is no Drinks in the menu/queue, the first Drink as element if there is
     * any Drinks in menu/queue
     * @author Marin Sekic
     */

    @Override
    public Object remove() {
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        elements.remove((SimpleDrink) element);
        return element;
    }


    /**
     * gets the first drink in the menu
     * @return null if there is no Drinks in the menu/list, the first Drink as element if there is any Drinks
     * in menu/queue
     * @author Mohammed Alamer
     */
    @Override
    public Object peek() {
        Object element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    /**
     * gets the first drink in the menu
     * @return NoSuchElementExceptio if there is no Drinks in the menu/list or the first Drink as element if there is
     * any Drinks in menu/queue
     * @author Mohammed Alamer
     */
    @Override
    public Object element() {
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
