//State subclass specific to Hawaii
public class Hawaii extends State {
    //Hawaii object constructor that defines interface as FourHalfPercent
    public Hawaii() {
        salesTaxBehavior = new FourHalfPercent();
        //sets State name to Hawaii
        setName("Hawaii");
    }
}
