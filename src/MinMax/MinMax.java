package MinMax;

import java.util.Arrays;

public class MinMax {
    public MinMax(){}

    public int[] minMax(int[] arr){
        Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
}
