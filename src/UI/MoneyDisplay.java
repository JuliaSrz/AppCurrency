package UI;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoneyDisplay extends JPanel {

    private static JTextField amount;
    private static ExchangeDialog exchangeDialog;
    
    public MoneyDisplay() {
        super();
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
        return exchangeDialog = new ExchangeDialog();
    }

    public static ExchangeDialog getExchangeDialog() {
        return exchangeDialog;
    }
    
}
