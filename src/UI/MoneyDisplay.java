package UI;

import javax.swing.JPanel;
import javax.swing.JTextField;

class MoneyDisplay extends JPanel {

    private static JTextField amount;

    public MoneyDisplay() {
        super();
        add(createTextField());
        add(new ExchangeDialog());
    }

    private JTextField createTextField() {
        return amount = new JTextField(10);
    }

    public static JTextField getTextField() {
        return amount;
    }
    
    
}
