package Pattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by AlexJIANG on 12/15/15.
 */
public class Test implements Runnable{


    private int count=1;
    public static void main(String args[]){
        Test test=new Test();
        Thread t=new Thread(test);
        Thread tt=new Thread(new Test());
        t.start();
        tt.start();
        ExecutorService es= Executors.newFixedThreadPool(1);
        es.submit(new Test());
        es.submit(new Test());
    }

    @Override
    public void run() {
        Singleton single=Singleton.getInstance();
        System.out.println(single.getCount());
        System.out.println(Thread.currentThread().getName()+":"+getCount());

    }
    public int getCount() {
        count++;
        return count;
    }
}
