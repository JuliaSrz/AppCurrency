package persistance;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    private static String name, code, symbol;
    
    private static void loadCurrency(){
        add(Euro());
        add(Pound());
        add(AmericanDollar());
    }
    
    
    private static CurrencySetLoader.loadCurrency Euro() {
        name = "Euro";
        code = "EUR";
        symbol = "€";
    }

    private static CurrencySetLoader.loadCurrency Pound() {
        name = "Pound";
        code = "GBP";
        symbol = "£";
    }

    private static CurrencySetLoader.loadCurrency AmericanDollar() {
        name = "AmericanDollar";
        code = "USD";
        symbol = "€";
    }


}
