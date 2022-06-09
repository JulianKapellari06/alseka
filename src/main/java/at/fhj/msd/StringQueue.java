package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * StringQueue represents a String list
 */
public class StringQueue implements IQueue {

    /**
     * the menu and its size/length
     */
    private List<String> elements = new ArrayList<String>();
    private int maxSize;

/**
 * StringQueue(int maxSize): constructor of the Drink menu
 */
    public StringQueue(int size) {
        this.maxSize = size;
    }

    /**
     * adds a String to the menu
     * @param obj is data type Object, in order to add different types of data to the list
     * @return true or false, true if a drink could be added successfully
     */
    @Override
    public boolean offer(Object obj) {
        if (elements.size() != maxSize)
            elements.add((String) obj);
        else
            return false;

        return true;
    }


    /**
     * gets the first drink in the menu and then removes it from list
     * @return null if there is no Strings in the list, the first Drink as element if there is
     * any String in list
     */
    @Override
    public String poll() {
        String element = peek();

        if (element != null) {
            elements.remove(element);
            return element;
        } else {
            return null;
        }
    }

    /**
     * gets the first drink in the menu and then removes it from list
     * @return NoSuchElementException if there is no Strings in the list, the first Drink as element if there is
     * any String in list
     */
    @Override
    public String remove() {
        String element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        elements.remove(element);
        return element;
    }


    /**
     * gets the first string in the list
     * @return null if there is no Strings in the list, the first String as element if there is any String
     * in list
     */
    @Override
    public String peek() {
        String element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }
    
    /**
     * gets the first string in the list
     * @return NoSuchElementException if there is no Strings in the list, the first String as element if there is any String
     * in list
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}