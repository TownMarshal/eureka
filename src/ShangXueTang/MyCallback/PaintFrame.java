package ShangXueTang.MyCallback;

/**
 * Created by Administrator on 2021/3/28 0028.
 * 回调CallBack，钩子函数（方法）Hook,模板方法模式
 */
public class PaintFrame {
    public static void drawFrame(IMyFrame f) {
        System.out.println("启动线程");
        System.out.println("增加循环");
        System.out.println("查看消息栈");

        //画窗口
        f.paint();

        System.out.println("启动缓存，增加效率");
    }

    public static void main(String[] args) {
        drawFrame(new GameFrame01());
    }
}

class GameFrame01 implements IMyFrame {
    @Override
    public void paint() {
        System.out.println("GameFrame01.paint()");
        System.out.println("画窗口");
    }
}
