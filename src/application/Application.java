package application;
import UI.MoneyCalculatorFrame;
import control.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application {

    public static void main(String[] args) {
        new MoneyCalculatorFrame();
        /*frame.register(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        new ExchangeOperation().execute();
        }
        });*/
    }
    
}
