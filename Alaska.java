//State subclass specific to Alaska
public class Alaska extends State {
    //Alaska object constructor that defines interface as NoTax
    public Alaska() {
        salesTaxBehavior = new NoTax();
        //sets State name to Alaska
        setName("Alaska");
    }
}