package application;
import control.ExchangeOperation;
import UI.MoneyCalculatorFrame;
import UI.MoneyDisplay;
import model.CurrencySet;
import persistance.CurrencySetLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application {

    public static void main(String[] args) {
        MoneyCalculatorFrame moneyCalculatorFrame = new MoneyCalculatorFrame();
        CurrencySet currencySet = new CurrencySetLoader().load();
        moneyCalculatorFrame.register("Calcular", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                //new ExchangeOperation(MoneyDisplay.getTextField().getText()).execute();??
            }
            
        });
        
        /*frame.register(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        new ExchangeOperation().execute();
        }
        });*/
    }
    
}
