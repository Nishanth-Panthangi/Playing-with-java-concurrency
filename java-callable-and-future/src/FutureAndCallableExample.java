import java.util.concurrent.*;
/**
 * Created by nishanth on 22/09/21.
 */

public class FutureAndCallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {
            // Perform some computation
	    System.out.println("Entered Callable");
            Thread.sleep(2000);
            return "Hello from Callable";
        };
}
