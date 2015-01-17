package control;
import UI.MoneyCalculatorFrame;
import model.ExchangeRate;
import persistance.ExchangeRateLoader;
import process.Exchanger;

public class ExchangeOperation {
    
    private MoneyCalculatorFrame dialog;
    private ExchangeRate exchangeRate;
    private String stringResult;
    
    public ExchangeOperation(MoneyCalculatorFrame dialog) {
        this.dialog = dialog;
    }
    
    public void execute() {
        exchangeRate = new ExchangeRateLoader().load(dialog.getExchange().getMoney().getCurrency(), dialog.getExchange().getCurrency());
               
        stringResult = String.valueOf((new Exchanger().exchange(dialog.getExchange().getMoney(), exchangeRate)).getQuantity());
        stringResult+= " " +((new Exchanger().exchange(dialog.getExchange().getMoney(), exchangeRate)).getCurrency());
        dialog.createResultLine(stringResult);
        
        
    }   

    
}
