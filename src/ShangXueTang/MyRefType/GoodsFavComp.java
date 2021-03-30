package ShangXueTang.MyRefType;
/**
 * 按收藏量排序的业务类 （升序）
 * @author Administrator
 *
 */
public class GoodsFavComp implements java.util.Comparator<Goods> {

    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getFav()-o2.getFav();
    }

}