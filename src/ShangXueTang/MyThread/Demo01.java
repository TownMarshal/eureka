package ShangXueTang.MyThread;

public class Demo01 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(()->{
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        },"B").start();

        new Thread(()->{
            for (int i = 0; i < 60; i++) {
                ticket.sale();
            }
        },"C").start();
    }
}

class  Ticket {
    //现在有100张票
private int num=100;
//卖票的方式//synchronized 本质就是对列，排队，锁
   public synchronized  void  sale(){
        if (num>0){
            System.out.println(Thread.currentThread().getName()+"卖出了"+(num--)+"张票，剩余"+num+"张票");
        }
    }
}