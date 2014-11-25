package UI;

import javax.swing.JComboBox;
import javax.swing.JPanel;

class ExchangeDialog extends JPanel {

    public ExchangeDialog() {
        super();
        add(createComboBox());
    }

    private JComboBox createComboBox() {
        return new JComboBox(new String[] {"EUR", "USD", "GBP"}); //Habria que cargarlas de la bbdd
    }
    
}
