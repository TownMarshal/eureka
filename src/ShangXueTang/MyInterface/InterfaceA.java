package ShangXueTang.MyInterface;

/**
 * Created by Administrator on 2021/3/28 0028.
 * 接口可以实现多继承
 */
public interface InterfaceA {
    void  aaa();
}
interface interfaceB{
    void bbb();

}
interface  interfaceC extends InterfaceA,interfaceB{
    void ccc();
}

class TestClass implements interfaceC{
    @Override
    public void aaa(){}
    @Override
    public void bbb(){}
    @Override
    public void ccc(){}

}
