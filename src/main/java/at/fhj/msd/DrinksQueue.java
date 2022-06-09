package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

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
        return null;
    }

    @Override
    public Object element() {
        return null;
    }
}
