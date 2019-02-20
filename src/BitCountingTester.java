import java.util.Scanner;
public class BitCountingTester {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = reader.nextInt();
        BitCounting one = new BitCounting();
        System.out.println("Number of 1's in " + n + "'s binary form: " + one.getBits(n));
        reader.close();
    }
}
