package control;
import UI.MoneyCalculatorFrame;
import model.ExchangeRate;
import persistance.ExchangeRateLoader;
import process.Exchanger;

public class ExchangeOperation {
    
    private final MoneyCalculatorFrame dialog;
    private ExchangeRate exchangeRate;

    public ExchangeOperation(MoneyCalculatorFrame dialog) {
        this.dialog = dialog;
    }
    
    public void execute() {
        /*System.out.println(dialog.getExchange().getMoney().getQuantity());
        System.out.println(dialog.getExchange().getMoney().getCurrency().getCode());
        System.out.println(dialog.getExchange().getCurrency().getCode());*/
        exchangeRate = new ExchangeRateLoader().load(dialog.getExchange().getMoney().getCurrency(), dialog.getExchange().getCurrency());
        System.out.println((new Exchanger().exchange(dialog.getExchange().getMoney(), exchangeRate)).getQuantity());
        System.out.println((new Exchanger().exchange(dialog.getExchange().getMoney(), exchangeRate)).getCurrency());
        
        //hay que ponerlo en la label supongo
    }   

    
}
