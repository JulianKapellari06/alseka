package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

public class DrinksQueue implements IQueue{
    private List<String> elements = new ArrayList<String>();
    private int maxSize;

    public DrinksQueue(int maxSize){
        this.maxSize = maxSize;
    }

    @Override
    public boolean offer(String obj) {
        return false;
    }

    @Override
    public String poll() {
        return null;
    }

    @Override
    public String remove() {
        return null;
    }

    @Override
    public String peek() {
        return null;
    }

    @Override
    public String element() {
        return null;
    }
}
