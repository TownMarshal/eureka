package ShangXueTang.MyGeneric;


public class Test5 {
    public static void main(String[] args) {
        MethodGeneric methodGeneric =new MethodGeneric();
        String[]arr =new String[]{"a","b","c"};
        Integer []arr1=new Integer[]{1,2,3};
        methodGeneric.method(arr);
        methodGeneric.method(arr1);
    }
}
