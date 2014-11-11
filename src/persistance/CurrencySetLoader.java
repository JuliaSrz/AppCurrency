package persistance;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    private static String name, code, symbol;
    private final static Currency Euro = new Currency ("EUR", "Euro", "€");
    private final static Currency AmericanDollar = new Currency ("USD", "American Dollar", "$");
    private final static Currency Pound = new Currency ("GBP", "Pound", "£");
    
    private static void loadCurrency(){
            CurrencySet.currencySet.add(Euro);
            CurrencySet.currencySet.add(AmericanDollar);
            CurrencySet.currencySet.add(Pound);
    }

}
