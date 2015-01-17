package UI;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import model.Currency;
import model.CurrencySet;

public class ExchangeDialog extends JPanel {

    private CurrencySet currencySet;
    private JComboBox<Currency> combo;
    
    public ExchangeDialog(CurrencySet currencySet) {
        super();
        this.currencySet = currencySet;        
        add(createComboBox());
    }

    private JComboBox createComboBox() {
        combo = new JComboBox<>(currencySet.getItems());
        return combo;
    }

    protected Currency getCurrency() {
        return (Currency)combo.getSelectedItem();
    }

}