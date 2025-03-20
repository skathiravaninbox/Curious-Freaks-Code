import java.util.*;
class no_of_prime {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count = countPrimes(n);
        System.out.println(count);
        obj.close();
    }

    // Function to count prime numbers up to n
    public static int countPrimes(int n) {
        if (n < 2) return 0; // No prime numbers less than 2

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
