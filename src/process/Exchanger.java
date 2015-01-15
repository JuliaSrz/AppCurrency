package process;

import model.Currency;
import model.ExchangeRate;
import model.Money;

public class Exchanger {
    private Money to;
    private double rate;
    
    public Money exchange(Money from, ExchangeRate to){
        rate = to.getRate();
        Money money = new Money(rate*from.getQuantity(), to.getTo());
        return money;
    }
    
}
