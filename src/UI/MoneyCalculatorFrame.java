package UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Currency;
import model.Exchange;
import model.ExchangeRate;
import model.Money;

public class MoneyCalculatorFrame extends JFrame{

    public ExchangeDialog exchangeDialog;
    public MoneyDisplay moneyDisplay;
    public static JLabel initialLabel;
    private Map<String,ActionListener> listeners;

    
    public MoneyCalculatorFrame() {
        setVisible(true);
        setTitle("MoneyCalculator");
        createWidgets();
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setMinimumSize(new Dimension(400, 200));
        setResizable(false);
    }

    private void createWidgets() {
        add(createExchangeDialog(),BorderLayout.NORTH);
        add(createResultLine(), BorderLayout.CENTER);
        add(createToolbar(), BorderLayout.SOUTH);
    }

    private JPanel createExchangeDialog() {
        JPanel panel = new JPanel(new FlowLayout());
        exchangeDialog = new ExchangeDialog();
        moneyDisplay = new MoneyDisplay();
        panel.add(moneyDisplay);
        panel.add(exchangeDialog);
        return panel;
    }
    
    private JPanel createResultLine() {
        JPanel panelBelow = new JPanel(new FlowLayout());
        initialLabel = createResultOutput("hola");
        panelBelow.add(initialLabel);
        return panelBelow;
    }

    private JPanel createToolbar() {
        JPanel toolBar = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        toolBar.add(createCalculateButton());
        toolBar.add(createCancelButton());
        return toolBar;
    }

    private JButton createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(createListener("Calcular"));
        return button;
    }

    private JButton createCancelButton(){
        JButton button = new JButton("Close");
        button.addActionListener(createListener("Close"));
        return button;
    }
    
    //Hacer este como el otro
    /*private JButton createCancelButton() {
        JButton button = new JButton("Close");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MoneyCalculatorFrame.this.dispose();
            }
        });
        return button;
    }*/

    private ActionListener createListener(final String command) {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listeners.get(command).actionPerformed(e);
            }
        };
    }
    
    private JLabel createResultOutput(String resultOutput) {
        JLabel label = new JLabel(resultOutput);
        return label;
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
    
    public ExchangeDialog getDialog(){
        return exchangeDialog;
    }
    
    public MoneyDisplay getMoney(){
        return moneyDisplay;
    }
    
////
    private void operationResult(){
        Currency currency = new Currency("LOL", "ok", "%");
        Money prueba = new Money(0.4, currency);
        ExchangeRate exchangeRate = new ExchangeRate(currency, currency, 0.3);
        Double valor = Double.parseDouble(MoneyDisplay.getTextField().getText());
        
        initialLabel.setText(Double.toString(exchangeRate.getRate()*valor));
        //System.out.print(this.getExchange().getCurrency().getCode());
        
    }



}
