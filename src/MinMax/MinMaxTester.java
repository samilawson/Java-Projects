package MinMax;
import java.util.Arrays;
public class MinMaxTester {

    public static void main(String[] args){
        MinMax one = new MinMax();
        int[] input = new int[]{3, 5, 1, 4,7, 16, 35, 342, 545, 2};
        String toReturn = Arrays.toString(one.minMax(input));
        System.out.println(toReturn);
    }
}
