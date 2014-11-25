package model;

public class Money {

    private final Fraction quantity;
    private final Currency currency;
    
    public Money(Fraction quantity, Currency currency) {
        this.quantity = quantity;
        this.currency = currency;
    }

    public Fraction getQuantity() {
        return quantity;
    }

    public Currency getCurrency() {
        return currency;
    }
        
}
