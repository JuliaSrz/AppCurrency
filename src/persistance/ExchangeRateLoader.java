package persistance;

import model.Currency;
import model.Exchange;

public class ExchangeRateLoader {
 
    private Currency from, to;
    private double rate;

    public double load(Currency from, Currency to){
        rate = 0.5;
        return rate;
    }
}