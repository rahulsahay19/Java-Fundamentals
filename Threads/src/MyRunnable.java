public class MyRunnable implements Runnable{

    //runnable is another way of creating thread.
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_RED + "Hello from runnable");
    }
}
