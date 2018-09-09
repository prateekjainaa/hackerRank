package medium;

import java.math.BigInteger;

public class ExtraLongFactorial {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger product = BigInteger.valueOf(1);
        for (int i=1; i<=n; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }
        System.out.println(product.toString());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        extraLongFactorials(5);
    }

}
