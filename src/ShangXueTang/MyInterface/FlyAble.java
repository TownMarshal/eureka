package ShangXueTang.MyInterface;

/**
 * Created by Administrator on 2021/3/28 0028.
 */
public interface FlyAble {
    int MAX_SPEED=11000;
    int MIN_SPEED=1;
  /*public abstract*/  void fly();
}
interface Attack{
    void attack();
}
class plane implements FlyAble{
    @Override
    public void fly(){
        System.out.println("飞机依靠发动机飞");
    }
}
class Man implements FlyAble,Attack{
    @Override
    public void fly(){
        System.out.println("人，跳起来飞人");
    }
    @Override
    public void attack(){
        System.out.println("人，具有攻击性！");

    }
}
