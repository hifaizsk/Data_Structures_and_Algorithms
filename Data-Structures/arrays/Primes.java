import java.util.Scanner;

// Example of a use case of single/linear dimension Array
public class Primes {

  // Sieve of Eratosthenes
  private static void printPrimes(int n) {
    boolean[] prime = new boolean[n + 1];

    // Assuming all numbers from '2' to 'n' as Primes, so setting all numbers to true.
    for (int i = 2; i <= n; i++) {
      prime[i] = true;
    }

    // Setting numbers not prime by setting the corresponding boolean value to 'false'.
    for (int divisor = 2; divisor <= Math.sqrt(n); divisor++) {
      if (prime[divisor]) {
        for (int i = 2 * divisor; i <= n; i = i + divisor) {
          prime[i] = false;
        }
      }
    }

    // Printing Primes
    for (int i = 2; i <= n; i++) {
      if (prime[i]) {
        System.out.println(i);
      }
    }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.close();
    printPrimes(number);
  }

}
