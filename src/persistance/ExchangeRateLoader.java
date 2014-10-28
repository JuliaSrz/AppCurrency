package persistance;

import model.Currency;

public class ExchangeRateLoader {
 
    private Currency from, to;
    private float rate;

    public ExchangeRateLoader() {
        from = loadCurrency;
        to = loadCurrency;
        rate = loadRate(from, to);
    }
    
    
}
