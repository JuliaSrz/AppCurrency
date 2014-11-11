package model;

import java.util.Iterator;
import java.util.LinkedList;

public class CurrencySet implements Iterable {

    public static LinkedList<Currency> currencySet;

    public CurrencySet(LinkedList<Currency> currencySet) {
        this.currencySet = currencySet;
    }

    public void add(Currency currency) {
        if (currencySet.contains(currency)) {
            currencySet.add(currency);
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {

            int i = 0;

            @Override
            public boolean hasNext() {
                return currencySet.size() > i;
            }

            @Override
            public Object next() {
                i++;
                return currencySet.get(i);
            }

            @Override
            public void remove() {
            }


        };
    }

}
