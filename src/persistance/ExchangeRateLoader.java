package persistance;

import model.Currency;
import model.Exchange;
import model.Fraction;

public class ExchangeRateLoader {
 
    private Currency from, to;
    private Fraction rate;

    public Fraction load(Currency from, Currency to){
        rate = new Fraction (1,2);
        return rate;
    }
}