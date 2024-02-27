public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            // using Runnable interface
            Loader obj = new Loader(i);
            Thread t = new Thread(obj);
            t.start();
            // useful thread methods
        }
        // if exception occurred on one thread the other threads will execute because nothing has happened on the other threads.
        throw new RuntimeException();
    }
}