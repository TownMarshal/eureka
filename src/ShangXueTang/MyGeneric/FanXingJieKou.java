package ShangXueTang.MyGeneric;

/**
 * 泛型主要用于编译时期，编译后生成的字节码文件不包含泛型类中的类型信息
 * @param <T>
 */
public interface FanXingJieKou<T> {
        T getName(T name);
}
