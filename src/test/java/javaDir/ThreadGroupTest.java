package javaDir;

/**
 * Created by Administrator on 2017/07/26.
 */
public class ThreadGroupTest {
    public static void main(String[] args) {
        MyThreadGroup mtg=new MyThreadGroup("我的线程组");
        MyThread[] myThreads=new MyThread[10];
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i]=new MyThread(mtg,"线程"+(i+1),"1");
            myThreads[i].start();
        }
        MyThread newThread= new MyThread(mtg,"报错线程", "a");
        newThread.start();
    }
}
class  MyThreadGroup extends ThreadGroup{

    public MyThreadGroup( String name) {
        super( name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        this.interrupt();
    }
}
class MyThread extends  Thread{
    private String num;
    public MyThread(ThreadGroup tg,String name,String num){
    super(tg,name);
    this.num=num;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);

        while (this.isInterrupted() == false) {
            System.out.println("死循环中：" + Thread.currentThread().getName()+"i="+numInt);
        }
    }
}