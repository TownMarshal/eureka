package datastructure.algorithm;

public class ReplaceSpace {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("hello world java");
        System.out.println("replaceAll(buffer) = " + replaceAll(buffer));
    }

    public static String replaceAll(StringBuffer str) {
        int length = str.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char b = str.charAt(i);
            if (" ".equals(String.valueOf(b))) {
                result.append("%20");
            } else {
                result.append(b);
            }

        }
        return result.toString();
    }
}
