  
/**
 * Created by nishanth on 29/08/21.
 */
public class ThreadSleepExample {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        String[] messages = {"If you always try your best,",
                "Then you will never have to wonder,",
                "About what you could have done.,",
                "If you'd summoned all your thunder."};

        Runnable runnable = () -> {
            System.out.println("Inside : " + Thread.currentThread().getName());

            for(String message: messages) {
                System.out.println(message);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            }
        };

        Thread thread = new Thread(runnable);

        thread.start();
    }
}
