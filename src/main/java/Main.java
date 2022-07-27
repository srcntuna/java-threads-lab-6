import java.util.Scanner;
import java.util.concurrent.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create an executor
        ExecutorService executor = Executors.newSingleThreadExecutor();;

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            // submit tasks to your executor
            executor.submit(new PrimeLogger(num));
        }

        executor.shutdown();
    }
}

class PrimeLogger implements Runnable {
    private final int num;

    public PrimeLogger(int num) {
        this.num = num;
    }

    @Override
    public void run() {

        boolean isPrime = IntStream.rangeClosed(2,num/2).allMatch(number -> num % number !=0);

        if(isPrime){
            System.out.println(num + " is PRIME number!");
        }
    }
}