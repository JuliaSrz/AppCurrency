package model;

import java.util.Iterator;
import java.util.LinkedList;

public class CurrencySet implements Iterable {

    public static LinkedList<Currency> currencyList;

    public CurrencySet(LinkedList<Currency> currencyList) {
        CurrencySet.currencyList = currencyList;
    }

    public void add(Currency currency) {
        if (!currencyList.contains(currency)) {
            currencyList.add(currency);
        }
    }

    public int getItem(int lil){
        return lil;
    }
    /*public Currency[] getItems() {
//        Currency[] currencycosa = currencyList.toArray(new Currency[currencyList.size()]);
//        for (Currency currencycosa1 : currencycosa) {
//            System.out.println(currencycosa1.getCode());
//        }
        Currency AmericanDollar = new Currency ("USD", "American Dollar", "$");
        Currency Pound = new Currency ("GBP", "Pound", "£");
        Currency Euro = new Currency ("EUR", "Euro", "€");
        
        Currency[] curr = {AmericanDollar, Pound, Euro};
        return curr;
    }*/
    
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
