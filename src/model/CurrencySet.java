package model;

import java.util.Iterator;
import java.util.LinkedList;

public class CurrencySet implements Iterable {

    public static LinkedList<Currency> currencyList;

    public CurrencySet(LinkedList<Currency> currencyList) {
        CurrencySet.currencyList = currencyList;
    }

    //Uhhhm ??? !?
    public void add(Currency currency) {
        if (!currencyList.contains(currency)) {
            currencyList.add(currency);
        }
    }

    public Currency[] getItems() {
        return currencyList.toArray(new Currency[currencyList.size()]);
    }
    
    @Override
    public Iterator iterator() {
        return new Iterator() {

            int i = 0;

            @Override
            public boolean hasNext() {
                return currencyList.size() > i;
            }

            @Override
            public Object next() {
                i++;
                return currencyList.get(i-1);
            }

            @Override
            public void remove() {
            }


        };
    }

}
