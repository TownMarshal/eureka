package ShangXueTang.MyJuc.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new Thread().start();
        Mythread mythread=new Mythread();
        FutureTask futureTask = new FutureTask(mythread);//适配类
        new Thread(futureTask,"A").start();
        new Thread(futureTask,"B").start();//结果会被缓存，效率高
        Integer o = (Integer)futureTask.get();//获取Callable的返回结果，这个get方法可能会产生阻塞
        //异步通信
        System.out.println(o);
    }
}
class Mythread implements Callable<Integer> {

    @Override
    public Integer call() {
        System.out.println("call()");
        //耗时的操作

        return 1024;
    }
}
