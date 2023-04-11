package datastructure.singlylinkedlist;

//单向链表类 添加和遍历
public class TestRecursion {
    public static void main(String[] args) {
        SinglyLinkedList3 list = new SinglyLinkedList3();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.loop4((var) -> {
            System.out.println("before" + var);
        }, (var) -> {
            System.out.println("after" + var);
        });


    }
}