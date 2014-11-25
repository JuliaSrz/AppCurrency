package UI;

import javax.swing.JPanel;
import javax.swing.JTextField;

class MoneyDisplay extends JPanel {

    public MoneyDisplay() {
        super();
        add(createTextField());
        add(new ExchangeDialog());
    }

    private JTextField createTextField() {
        return new JTextField(10);
    }
    
}
