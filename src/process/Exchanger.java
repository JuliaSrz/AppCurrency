package process;

import model.Currency;
import model.ExchangeRate;
import model.Fraction;
import model.Money;

public class Exchanger {
    private Money to;
    private Fraction rate;
    
    public Money exchange(Money from, ExchangeRate to){
       // to = new Money (from.getQuantity()*rate.getRate(), rate.getTo());
        Money prueba = new Money(new Fraction(3,4), new Currency("LOL", "ok", "€"));
        return prueba;
    }
    
}
