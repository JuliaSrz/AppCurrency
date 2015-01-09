package UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Currency;
import model.ExchangeRate;
import model.Fraction;
import model.Money;
import process.Exchanger;

public class MoneyCalculatorFrame extends JFrame{

    JLabel label = new JLabel("");

    
    public MoneyCalculatorFrame() {
        setVisible(true); //siempre al final porque si no se renderiza sin cargar todos los componentes
        setTitle("MoneyCalculator");
        createWidgets();
        setDefaultCloseOperation(EXIT_ON_CLOSE); //si no al dar a la x se sigue ejecutando aunque la ventana este cerrada
        setMinimumSize(new Dimension(400, 200));
        setResizable(false);
    }

    private void createWidgets() {
        //this.getContentFrame().add(createCalculateButton(), BorderLayout.SOUTH);
        add(createExchangeDialog());
        add(label);
        add(createToolbar(), BorderLayout.SOUTH); //O lo pone en el centro por defecto
    }

    private JPanel createExchangeDialog() {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new MoneyDisplay());
        panel.add(new ExchangeDialog());
        return panel;
    }

    private JPanel createToolbar() {
        JPanel toolBar = new JPanel(new FlowLayout(FlowLayout.RIGHT)); //rellena de dcha a izda
        toolBar.add(createCalculateButton());
        toolBar.add(createCancelButton());
        return toolBar;
    }

    private JButton createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print(MoneyDisplay.getTextField().getText());
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
                //accede al metodo superior y cierra. dispose solo vale porque no colisiona con action listener
                //pero asi como que se ve mas claro, rite?
            }
        });
        return button;
    }
    
    private void operationResult(){
        Fraction fraction = new Fraction(3, 4);
        Currency currency = new Currency("LOL", "ok", "%");
        Money prueba = new Money(fraction, currency);
        ExchangeRate exchangeRate = new ExchangeRate(currency, currency, new Fraction(3, 4));
        Exchanger exchanger = new Exchanger(prueba, exchangeRate);
        label.setText(exchanger.getQuantity());
    }

}
