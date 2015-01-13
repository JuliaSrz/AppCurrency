package UI;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import model.Currency;

public class ExchangeDialog extends JPanel {
    
    JComboBox<Currency> combo = new JComboBox(new String[] {"EUR", "USD", "GBP"}); 
    
    public ExchangeDialog() {
        super();
        add(createComboBox());
    }

    private JComboBox createComboBox() {
        return combo;
    }
    
    public Currency getCurrency() {
        return combo.getItemAt(combo.getSelectedIndex());
    }

}
