package process;

import model.Currency;
import model.ExchangeRate;
import model.Fraction;
import model.Money;

public class Exchanger {
    private Money to;
    private Fraction rate;
    
    public Money exchange(Money from, ExchangeRate to){
        Fraction fraction = new Fraction(3, 4);
        Currency currency = new Currency("LOL", "ok", "%");
        Money prueba = new Money(fraction, currency);
        return prueba;
    }
    
}
