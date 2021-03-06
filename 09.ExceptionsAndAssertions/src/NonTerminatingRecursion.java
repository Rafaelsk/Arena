/**
 * User: rafael
 * Date: 11/3/13
 * Time: 5:27 PM
 */
class NonTerminatingRecursion {
    // factorial is a recursive call
    static int factorial(int n) {
        int result = 0;
        // Assume that the following termination condition statement is missing ...
        // if(n == 0) return 1;
        result = factorial(n - 1) * n;
        return result;
    }
    public static void main(String ... args) {
        System.out.println("factorial of 4 is: " + factorial(2));
    }
}

