package money;

public class MoneyTester {

    public static void main(String[] args){
        Money one = new Money();
        int years = one.calculateYears(1000, .05, .18, 1100);
        System.out.println("Number of years until desired amount: " + years);
    }
}
