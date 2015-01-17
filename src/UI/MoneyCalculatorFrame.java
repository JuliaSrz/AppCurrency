package UI;

import java.util.Map;
import java.util.HashMap;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import model.Money;
import model.Exchange;
import model.Currency;
import model.CurrencySet;

public class MoneyCalculatorFrame extends JFrame {

    private CurrencySet currencySet;
    private ExchangeDialog exchangeDialog;
    private MoneyDisplay moneyDisplay;
    private JLabel initialLabel;
    private JPanel panelBelow;
    private final Map<String, ActionListener> listeners;

    public MoneyCalculatorFrame(CurrencySet currencySet) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("MoneyCalculator");
        setVisible(true);
        initialLabel = new JLabel();
        panelBelow = new JPanel(new FlowLayout());
        this.currencySet = currencySet;
        createWidgets();
        this.listeners = new HashMap<>();
        setMinimumSize(new Dimension(400, 200));
        setResizable(false);

    }

    private void createWidgets() {
        add(createExchangeDialog(), BorderLayout.NORTH);
        add(createResultLine("Por favor, introduzca los datos."), BorderLayout.CENTER);
        add(createToolbar(), BorderLayout.SOUTH);
    }

    private JPanel createExchangeDialog() {
        JPanel panel = new JPanel(new FlowLayout());
        exchangeDialog = new ExchangeDialog(currencySet);
        moneyDisplay = new MoneyDisplay(currencySet);
        panel.add(moneyDisplay);
        panel.add(exchangeDialog);
        return panel;
    }

    private JPanel createToolbar() {
        JPanel toolBar = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        toolBar.add(createCalculateButton());
        toolBar.add(createCancelButton());
        return toolBar;
    }

    private JButton createCalculateButton() {
        JButton button = new JButton("Calcular");
        button.addActionListener(createListener("Calcular"));
        return button;
    }

    private JButton createCancelButton() {
        JButton button = new JButton("Close");
        button.addActionListener(createListener("Close"));
        return button;
    }

    private ActionListener createListener(final String command) {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listeners.get(command).actionPerformed(e);
            }
        };
    }

    public JPanel createResultLine(String string) {
        initialLabel.setText(string);
        panelBelow.add(initialLabel);
        return panelBelow;
    }

    public void register(String command, ActionListener actionListener) {
        this.listeners.put(command, actionListener);
    }

    public Exchange getExchange() {
        return new Exchange(getToCurrency(), new Money(getAmount(), getFromCurrency()));
    }

    public double getAmount() {
        return Double.parseDouble(MoneyDisplay.getTextField().getText());
    }

    public Currency getFromCurrency() {
        return MoneyDisplay.getExchangeDialog().getCurrency();
    }

    public Currency getToCurrency() {
        return exchangeDialog.getCurrency();
    }

    public MoneyCalculatorFrame getFrame() {
        return this;
    }

    public MoneyDisplay getMoney() {
        return moneyDisplay;
    }
}
