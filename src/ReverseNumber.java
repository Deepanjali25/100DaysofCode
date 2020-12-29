public class ReverseNumber {
    public static void main(String[] args) {
        int num = 10025;
        System.out.println("Input - " + num + " Output:" + reverseNo(num));
    }
    public static int reverseNo(int number) {
        int reversed = 0;
        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return  reversed;
    }
}
