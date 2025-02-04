//tax behavior for Indiana
public class SevenPercent implements SalesTaxBehavior {
    public Double compute(Double value) {
        //7% sales tax
        return (value * 0.07);
    }
}