public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 using loop is:" + factorialWithLoop(5));
        System.out.println("Factorial of 10 using recursion is:" + factorialWithRecursion(10));
        System.out.println("Factorial of negative number -100 is:" + factorialWithLoop(-100));
    }
    public static long factorialWithLoop(int n) {
        if(n < 0) {
            System.out.println("Negative nos can't have factorial");
            return -9999;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static long factorialWithRecursion(int n) {
        if(n < 0) {
            System.out.println("Negative nos can't have factorial");
            return -9999;
        }
        if (n <= 2) {
            return n;
        }
        return n * factorialWithRecursion(n - 1);
    }
}