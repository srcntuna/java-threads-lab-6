# Threads Lab 6

## Instructions

Create a program that takes integers as input from the user (standard input) and
only the numbers that are prime (in any order).

A prime number is any number greater than 1 that whose only factor is itself,
i.e., it cannot be formed by multiplying two smaller natural numbers.

The `main` method should read numbers from the user, create a task to check if
the number is prime, and print the number if it’s prime. Remember to properly
shutdown the executor you create.

## Starter Code

```java
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create an executor
        ExecutorService executor; 

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            // submit tasks to your executor
        }
    }
}

class PrimeLogger implements Runnable {
    private final int num;

    public PrimeLogger(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        // print num if it is prime
    }
}
```
