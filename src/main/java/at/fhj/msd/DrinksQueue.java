package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinksQueue implements IQueue{
    private List<Drink> elements = new ArrayList();
    private int maxSize;

    public DrinksQueue(int maxSize){
        this.maxSize = maxSize;
    }

    @Override
    public boolean offer(Object obj) {
        if (elements.size() != maxSize)
            elements.add((SimpleDrink) obj);
        else
            return false;

        return true;
    }

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

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object peek() {
        Object element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }


    @Override
    public Object element() {
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
