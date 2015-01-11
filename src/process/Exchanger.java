package process;

import model.Currency;
import model.ExchangeRate;
import model.Money;

public class Exchanger {
    private Money to;
    private double rate;
    
    public Money exchange(Money from, ExchangeRate to){
        double doble = 0.5;
        Currency currency = new Currency("LOL", "ok", "%");
        Money prueba = new Money(doble, currency);
        return prueba;
    }
    
}
