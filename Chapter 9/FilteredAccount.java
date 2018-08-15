public class FilteredAccount extends Account {
    private int totalTrans;
    private int zeroTrans;
    
    public FilteredAccount(Client c) {
        super(c);
        totalTrans = 0;
        zeroTrans = 0;
    }
    
    public boolean process(Transaction t) {
        totalTrans++;
        if (t.value == 0) {
            zeroTrans++;
            return true;
        }
        
        return super.process(t);
    }
    
    public double percentFiltered() {
        if (totalTrans == 0) {
            return 0.0;
        }
        return (double)zeroTrans * 100 / totalTrans;
       
    }
}
