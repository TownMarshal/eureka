package JingDianSuanFa;

public class ReplaceSpace {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("hello world java");
        System.out.println("replaceAll(buffer) = " + replaceAll(buffer));
    }

    public static String replaceAll(StringBuffer str) {
        int length = str.length();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char b = str.charAt(i);
            if (String.valueOf(b).equals(" ")) {
                result.append("%20");
            } else {
                result.append(b);
            }

        }
        return result.toString();
    }
}
