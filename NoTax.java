//tax behavior for Alaska
public class NoTax implements SalesTaxBehavior {
    public Double compute(Double value) {
        //No sales tax
        return 0.0;
    }
}