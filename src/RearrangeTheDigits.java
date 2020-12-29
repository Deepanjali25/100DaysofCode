import java.util.*;
public class RearrangeTheDigits {
    public static void main(String[] args) {
        String N = "55010";
        System.out.println(smallestNum(N));
    }
    public static String smallestNum(String N) {
        int[] arr = new int[N.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(N.charAt(i));
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        if (count > 0) {
            arr[0] = arr[count];
            arr[count] = 0;
        }
        StringBuilder s = new StringBuilder();
        for (int i : arr) {
            s.append(i); //add all the ints to a string
        }
        //int num = Integer.parseInt(s.toString());
        //return String.valueOf(num);
        return String.valueOf(s);
    }
}