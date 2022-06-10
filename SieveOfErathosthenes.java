import java.util.Scanner;
public class SieveOfErathosthenes {
    // method finds prime numbers up to give n limit
    public void checkIfPrime(int n){
        boolean primes[] = new boolean[n]; // create array of size n
        for(int i = 0; i<primes.length; i++){ // iterate through all booleans in array
            primes[i] = true; // set each boolean to true (indicating it is prime)
        }
        for(int i = 2; i*i<n; i++){ // iterate through all booleans in array starting from 2 up till square of number reaches n
            if (primes[i] == true){ // if boolean is still true (prime)
                for(int j = i*i; j<=n; j+=i){ // start from i^2 for all multiples of i
                    primes[j] = false; // set each boolean to false (indicating it is not prime)

                }
            }
        }
        for(int i = 2; i<n; i++){ // iterate through all booleans in array
            if (primes[i] == true){ // if boolean is still true (prime)
                System.out.print(i + " "); // print out that prime number
            }
        }
    }
    // tester
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // create a scanner
        System.out.println("Provide a limit for your prime numbers "); // ask user for n
        int n = scan.nextInt(); // take in input number -- check if integer?? don't assume
        var classInstance = new SieveOfErathosthenes();
        classInstance.checkIfPrime(n); // send into prime checker
    }
}
