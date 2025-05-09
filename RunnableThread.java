public class RunnableThread implements Runnable {
    public static void main(String[] args) {
        RunnableThread runnable=new RunnableThread();
        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
    @Override
    public void run(){
        for(int i=0;i<=20;i++)
        {
            System.out.println(i);
        }
    }
}
