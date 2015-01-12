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
import model.ExchangeRate;
import model.Money;

public class MoneyCalculatorFrame extends JFrame{

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
        //this.getContentFrame().add(createCalculateButton(), BorderLayout.SOUTH);
        add(createExchangeDialog(),BorderLayout.NORTH);
        add(createResultLine(), BorderLayout.CENTER);
        add(createToolbar(), BorderLayout.SOUTH);
    }

    private JPanel createExchangeDialog() {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new MoneyDisplay());
        panel.add(new ExchangeDialog());
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
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //control.ExchangeOperation.execute();
                operationResult();
            }
        });
        return button;
    }

    private JButton createCancelButton() {
        JButton button = new JButton("Close");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MoneyCalculatorFrame.this.dispose();
            }
        });
        return button;
    }

    private JLabel createResultOutput(String resultOutput) {
        JLabel label = new JLabel(resultOutput);
        return label;
    }
    
    public void register(String command, ActionListener actionListener) {
        this.listeners.put(command, actionListener);
    }
    ////
    private void operationResult(){
        Currency currency = new Currency("LOL", "ok", "%");
        Money prueba = new Money(0.4, currency);
        ExchangeRate exchangeRate = new ExchangeRate(currency, currency, 0.3);
        Double valor = Double.parseDouble(MoneyDisplay.getTextField().getText());
        
        initialLabel.setText(Double.toString(exchangeRate.getRate()*valor));
        
        
    }


}
