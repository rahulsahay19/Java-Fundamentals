public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE+ "Hello from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        //It enables JVM to run the run method for thread
        anotherThread.start(); //start will invoke a new thread while will run the same on the main thread.



        //This will throw exception. We can only use Thread instance once.
        //anotherThread.start();

        //we can run a different thread from anonymous class. Only thing is, it should get started immediately
        //This is how we create anonymous class. We can't gurantee the thread execution order but we can assign priorities
        new Thread(){
            public void run(){
                System.out.println(ThreadColor.ANSI_GREEN + "Hello from anonymous class");
            }
        }.start();
        //using runnable
        Thread myRunnableThread = new Thread(new MyRunnable()) ;
        myRunnableThread.start();
        //block runnable
        Thread myRunnableThread2 = new Thread(new MyRunnable(){
            @Override
            public void run() {
                //super.run();
                System.out.println(ThreadColor.ANSI_RED+"Hello from anonymous implementation of Run");
            }
        });
        myRunnableThread2.start();
       // anotherThread.interrupt();
        //by not specifying color, it will use the color code from the last thread.
        System.out.println(ThreadColor.ANSI_PURPLE+"Hello again from the main thread");
    }
}
