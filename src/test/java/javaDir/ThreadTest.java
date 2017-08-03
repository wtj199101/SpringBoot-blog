package javaDir;

/**
 * Created by Administrator on 2017/07/26.
 */
public class ThreadTest  extends  Thread  {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ThreadTest threadTest=new ThreadTest();
            ErrHander err=new ErrHander();
//            threadTest.setUncaughtExceptionHandler(err);
            Thread.setDefaultUncaughtExceptionHandler(err);
            threadTest.start();
        }
    }
    public void run() {
        double i=12/0;
    }

}
class ErrHander implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("This is:" + t.getName() + ",Message:"
                + e.getMessage());
        e.printStackTrace();

    }
}