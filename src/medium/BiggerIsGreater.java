package medium;

public class BiggerIsGreater {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        String output = "no answer";
        char[] chars = w.toCharArray();
        int position = -1;
        for(int i=chars.length-1; i > 0; i--) {
            if (chars[i] > chars[i-1]) {
                position = i;
                break;
            }
        }// for
        if (position == -1) {            
            return output;
        }
        System.out.println("first " + chars[position]);
        // find minimum to right of i
        char min = chars[position];
        int minPosition = -1;
        for (int i=position+1; i < chars.length-1; i++) {
            if (chars[i] < chars[i+1] && chars[i] > min) {
                min = chars[i];
                minPosition = i;
            } 
        }
        System.out.println("second " + min);
        
        
        return output;
    }

    public static void main(String[] args) {
        System.out.println(biggerIsGreater("dkhc"));

    }

}
