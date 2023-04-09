package datastructure.singlylinkedlist;

//单向链表类 添加和遍历
public class Test {
    public static void main(String[] args) {
     /*   SinglyLinkedList1 list = new SinglyLinkedList1();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.loop1(System.out::println);
        list.loop2(System.out::println);
        for (Integer value : list) {
            System.out.println(value);
        }*/
        SinglyLinkedList3 list = new SinglyLinkedList3();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.loop1(System.out::println);
        list.loop3();

        System.out.println(list.get(2));

    }
}