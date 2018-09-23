package recursion;

public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println("!3 == "+factorial(3));
        System.out.println("!4 == "+factorial(4));
        System.out.println("!5 == "+factorial(5));
        System.out.println("!6 == "+factorial(6));
        System.out.println("!7 == "+factorial(7));
    }
    private static long factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
