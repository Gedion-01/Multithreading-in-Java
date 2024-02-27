/*
inorder to use perform multi-threading: -
Inherit from the Thread class, override its run() method,
and write the functionality of the thread in the run() method.
The other way of creating Threads is implementing the Runnable interface.
Implement the run() method. Then, create a new Thread object, pass the Runnable class to its constructor,
and start the Thread by calling the start() method.
*/
public class Loader implements Runnable{
    private int threadNumber;
    public Loader(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for(int i = 0; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
