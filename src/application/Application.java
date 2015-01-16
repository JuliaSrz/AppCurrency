package application;

import model.CurrencySet;
import UI.MoneyCalculatorFrame;
import control.ExchangeOperation;
import persistance.CurrencySetLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application {

    public static void main(String[] args) {
        
        CurrencySet currencySet = new CurrencySetLoader().load();
        final MoneyCalculatorFrame moneyCalculatorFrame = new MoneyCalculatorFrame(currencySet);
        moneyCalculatorFrame.register("Calcular", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                new ExchangeOperation(moneyCalculatorFrame.getFrame()).execute();
            }

        });

        moneyCalculatorFrame.register("Close", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                moneyCalculatorFrame.dispose();
            }

        });
    }

}
