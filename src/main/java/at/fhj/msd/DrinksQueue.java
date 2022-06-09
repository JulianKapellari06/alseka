package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinksQueue implements IQueue{
    private List<Drink> elements = new ArrayList();
    private final int maxSize;

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
        Object element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        elements.remove((SimpleDrink) element);
        return element;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }
}
