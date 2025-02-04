//State subclass specific to Indiana
public class Indiana extends State {
    //Indiana object constructor that defines interface as SevenPercent
    public Indiana() {
        salesTaxBehavior = new SevenPercent();
        //sets State name to Indiana
        setName("Indiana");
    }
}
