package UI;

import java.util.LinkedList;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import model.Currency;
import model.CurrencySet;

public class ExchangeDialog extends JPanel {

    private final CurrencySet currencySet;
    JComboBox<Currency> combo;
    
    public ExchangeDialog(CurrencySet currencySet) {
        super();
        this.currencySet = currencySet;
        add(createComboBox());
    }

    public JComboBox createComboBox() {
        Currency[] prueba = CurrencySet.currencyList.toArray(new Currency[CurrencySet.currencyList.size()]);
        combo = new JComboBox<>(prueba);
        
        //System.out.println(currencySet.getItem(3));
        //combo = new JComboBox<>(currencySet.getItems());
        //WHY THE FUCK!?
        
        return combo;

        //return new JComboBox<>(currencySet.getItems());
    }

    public Currency getCurrency() {
        //return new Currency("Nah", "ok", "%");
        return (Currency)combo.getSelectedItem();
    }

}
