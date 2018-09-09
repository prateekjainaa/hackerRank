package easy;

import java.math.BigInteger;
import java.util.Arrays;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        BigInteger[] big = new BigInteger[5]; 
        for(int i=0; i<5; i++) {
            big[i] = BigInteger.valueOf(arr[i]);
        }
        Arrays.sort(big);
        BigInteger common = big[1].add(big[2]).add(big[3]);
        BigInteger min = big[0].add(common);
        BigInteger max = common.add(big[4]);
        System.out.println(min.toString() + " " + max.toString());
    }

    public static void main(String[] args) {

    }

}
