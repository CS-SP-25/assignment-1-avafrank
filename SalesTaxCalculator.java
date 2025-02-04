public class SalesTaxCalculator {
    //main method for taking command-line input and outputting tax
    public static void main(String[] args) {
        //takes args[0] as the state
        String inputState = args[0];
        
        //goes through possible state inputs
        if (inputState.equals("Indiana")) {
            //creates new state object according to input
            State indiana = new Indiana();
            //calculates tax based on value input from args[1]
            indiana.showTax(Double.valueOf(args[1]));
        } else if (inputState.equals("Alaska")) {
            //does the same process for Alaska as inputState
            State alaska = new Alaska();
            alaska.showTax(Double.valueOf(args[1]));
        } else {
            //assumes input is always  "Indiana", "Alaska", or "Hawaii"
            State hawaii = new Hawaii();
            hawaii.showTax(Double.valueOf(args[1]));
        }
    }
}