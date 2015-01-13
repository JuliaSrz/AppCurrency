package control;
import UI.MoneyCalculatorFrame;
import UI.ExchangeDialog;
        
public class ExchangeOperation {
    
    private final ExchangeDialog dialog;

    public ExchangeOperation(ExchangeDialog dialog) {
        this.dialog = dialog;
    }
    
    public void execute() {
        System.out.println("lol");
        //System.out.println(dialog.getExchange().getMoney().getQuantity());
        //System.out.println(dialog.getExchange().getMoney().getCurrency().getCode());
        //System.out.println(dialog.getExchange().getCurrency().getCode());
    }   
    
}
