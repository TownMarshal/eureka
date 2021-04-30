public class PalindromeList {

    public static void main(String[] args) {
        System.out.println(check("上海自来水来自海上"));
        System.out.println(check("上自海上"));
        System.out.println(check("上"));
    }

    public static String printNode(Node node){
        StringBuilder stringBuilder = new StringBuilder();
        for ( ; ;){
            stringBuilder.append(node.item.toString());
            if (!node.hasNext()){
                break;
            }
            node = node.next;
        }
        //System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    private static class Node<E>{
        E item;
        Node<E> next;

        Node(E element){
            this.item = element;
        }

        public boolean hasNext(){
            return next != null;
        }
    }

    //初始化链表
    public static Node init(String str){
        Node old = new Node(str.charAt(0));
        Node current = old;
        for (int i=1; i<str.length(); i++){
            current = current.next= new Node(str.charAt(i));
        }
        return old;
    }

    //检查是不是回文字符串
    public static boolean check(String s){
        if (s.length() < 2){
            return true;
        }

        //初始化链表
        Node old = init(s);

        //快慢指针
        int m = 0;
        Node current = old;
        Node prev = null;
        Node next = null;
        Node newone1 = null;
        Node newone2 = null;
        for (;;){
            boolean hasNext = current.hasNext();

            next = current.next;

            //判断奇数偶数，快指针到终点前，将链表逆序
            if ((s.length() % 2 == 0 && m < s.length()) || (s.length() % 2 != 0 && m < s.length() - 1 )){
                if (prev == null){
                    current.next = null;
                } else{
                    current.next = prev;
                }
            } else {
                //快指针到终点后，将前半截链表和后半截链表拆分
                if (m == s.length() - 1){
                    current = next;
                }
                newone1 = prev;
                newone2 = current;
                break;
            }

            m += 2;
            prev = current;
            current = next;

            if (!hasNext){
                break;
            }
        }

        if (newone1 == null || newone2 == null){
            return false;
        }
        String ss1 = printNode(newone1);
        String ss2 = printNode(newone2);

        return ss1.equals(ss2);
    }
}
