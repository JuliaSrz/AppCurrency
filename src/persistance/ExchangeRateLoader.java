package persistance;

import model.Currency;
import model.Exchange;
import model.ExchangeRate;

public class ExchangeRateLoader {
 
    private Currency from, to;
    private double rate;

    public ExchangeRate load(Currency from, Currency to){
        rate = 0.5;
        this.from = from;
        this.to = to;
        return new ExchangeRate(from, to, rate);
    }

}