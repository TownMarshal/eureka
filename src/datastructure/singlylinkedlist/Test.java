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
/*        SinglyLinkedList3 list = new SinglyLinkedList3();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);*/
/*        list.loop1(System.out::println);
        list.loop3();

        System.out.println(list.get(2));
        System.out.println(list.get(22));*/

/*        list.insert(0, 5);
        list.loop1(System.out::println);*/

    /*    list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.loop1(System.out::println);*/

/*
        list.remove(0);
        list.loop1(System.out::println);*/

        SinglyLinkedListSentinel sentinellist = new SinglyLinkedListSentinel();
        sentinellist.addLast(1);
        sentinellist.addLast(2);
        sentinellist.addLast(3);
        sentinellist.addLast(4);
//        sentinellist.loop1(System.out::println);

//        System.out.println(sentinellist.get(2));
//        sentinellist.loop3();
//        sentinellist.insert(5, 5);
     /*   sentinellist.addFirst(5);
        sentinellist.loop1(System.out::println);*/
      /*  sentinellist.removeFirst();
        sentinellist.removeFirst();
        sentinellist.loop1(System.out::println);*/

        sentinellist.remove(2);
        sentinellist.loop1(System.out::println);
    }
}