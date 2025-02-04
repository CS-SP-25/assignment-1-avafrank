//tax behavior for Hawaii
public class FourHalfPercent implements SalesTaxBehavior {
    public Double compute(Double value) {
        //4.5% sales tax
        return (value * 0.045);
    }
}