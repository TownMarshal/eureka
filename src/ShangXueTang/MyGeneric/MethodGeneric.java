package ShangXueTang.MyGeneric;


public class MethodGeneric {
    /**
     * 非静态泛型方法
     */
    public <T> void setName(T name){
        System.out.println(name);
    }
    public <T> T getName(T name){
        return  name;
    }


    /**
     * 静态泛型方法
     * 静态方法只能通过泛型方法的方式来使用泛型
     */
    public static  <T> void setFlag(T flag){
        System.out.println(flag);
    }
    public static <T> T getFlag(T flag){
        return flag;
    }


    public <T> void method(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }

//    public class Test5 {
//        public static void main(String[] args) {
//            MethodGeneric methodGeneric =new MethodGeneric();
//            String[]arr =new String[]{"a","b","c"};
//            Integer []arr1=new Integer[]{1,2,3};
//            methodGeneric.method(arr);
//            methodGeneric.method(arr1);
//        }
//    }

}
