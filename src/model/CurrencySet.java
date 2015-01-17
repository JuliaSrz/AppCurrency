package model;

import java.util.Iterator;
import java.util.LinkedList;

public class CurrencySet implements Iterable {

    private LinkedList<Currency> currencyList;

    public CurrencySet(LinkedList<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    public LinkedList<Currency> getCurrencyList() {
        return currencyList;
    }

    public Currency[] getItems(){
        return currencyList.toArray(new Currency[currencyList.size()]);
    }

    public void add(Currency currency) {
        if (!currencyList.contains(currency)) {
            currencyList.add(currency);
        }
    }
    
    public int getItem(int i){
        return i;
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
                return currencyList.get(i - 1);
            }

            @Override
            public void remove() {
            }

        };
    }

}
