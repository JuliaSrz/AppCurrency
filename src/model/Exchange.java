package model;

public class Exchange {
    private final Currency currency;
    private final Money money;

    public Exchange(Currency currency, Money money) {
        this.currency = currency;
        this.money = money;
    }
    
}
