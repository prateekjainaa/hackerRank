package easy;

public class StairCase {

    static void staircase(int n) {
        
        for (int i=n; i>0; i--) {
            for (int j=1; j<=n; j++) {
                if ( j >= i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        staircase(6);
    }

}
