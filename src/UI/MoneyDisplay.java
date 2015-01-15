package UI;

import javax.swing.JPanel;
import javax.swing.JTextField;
import model.CurrencySet;

public class MoneyDisplay extends JPanel {

    private static JTextField amount;
    private static ExchangeDialog exchangeDialog;
    private final CurrencySet currencySet;
    
    
    public MoneyDisplay(CurrencySet currencySet) {
        super();
        this.currencySet = currencySet;
        
        add(createTextField());
        add(createExchangeDialog());
    }

    private JTextField createTextField() {
        return amount = new JTextField(10);
    }

    public static JTextField getTextField() {
        return amount;
    }
    
    private ExchangeDialog createExchangeDialog() {
        return exchangeDialog = new ExchangeDialog(currencySet);
    }

    public static ExchangeDialog getExchangeDialog() {
        return exchangeDialog;
    }
    
}
