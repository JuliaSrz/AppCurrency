package persistance;

import java.util.LinkedList;
import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    private static String name, code, symbol;
    private final static Currency AmericanDollar = new Currency ("USD", "American Dollar", "$");
    private final static Currency Pound = new Currency ("GBP", "Pound", "£");
    private final static Currency Euro = new Currency ("EUR", "Euro", "€");
    private final static LinkedList<Currency> currencyList = new LinkedList<>();
    private final static CurrencySet currencySet = new CurrencySet(currencyList);
    
    private static void loadCurrency(){
        currencySet.add(Euro);
        currencySet.add(AmericanDollar);
        currencySet.add(Pound);
    }

    public CurrencySet load() {
        loadCurrency();
        return currencySet;
    }

}
