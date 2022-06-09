package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DoubleQueue implements IQueue{
    private List<Double> elements = new ArrayList<Double>();
    private int maxSize;

    public DoubleQueue(int size){
        this.maxSize = size;
    }

    @Override
    public boolean offer(Object obj) {
        if (elements.size() != maxSize)
            elements.add((Double) obj);
        else
            return false;

        return true;
    }

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

    @Override
    public Object remove() {
        Double element = (Double) peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");
        elements.remove(element);
        return element;
    }

    @Override
    public Object peek() {
        Double element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    @Override
    public Object element() {
        Double element = (Double) peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
