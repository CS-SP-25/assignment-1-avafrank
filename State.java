//class for all states to extend
public class State {
    //reference variable for interface types
    SalesTaxBehavior salesTaxBehavior;
    public State() { }
    //private name variable
    private String name;
    //accessor for name variable
    public String getName() { return name; }
    //mutator for name variable
    public void setName(String name) { this.name = name; }
    //showTax implementation that prints the desired output
    public void showTax(Double value) {
        Double tax = salesTaxBehavior.compute(value);
        String stateName = getName();
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, stateName, tax);
    }

}