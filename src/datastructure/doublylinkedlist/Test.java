package datastructure.doublylinkedlist;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedListSentinel list = new DoublyLinkedListSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
//
//        list.addFirst(5);
//        list.removeFirst();
//        list.addLast(11);
//        list.removeLast();
//        list.insert(2, 22);
//        list.remove(2);
//        for (Integer e : list) {
//            System.out.println(e);
//        }


        DoublyCircleLinkedListSentinel list1 = new DoublyCircleLinkedListSentinel();
        list1.addFirst(1);
        list1.addFirst(2);
        list1.addFirst(3);
        list1.addFirst(4);

        for (Integer e : list1) {
            System.out.println(e);
        }

        DoublyCircleLinkedListSentinel list2 = new DoublyCircleLinkedListSentinel();
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);
//        list2.removeFirst();
//        list2.removeFirst();
//        list2.removeFirst();
//        list2.removedFirst();
        list2.removeByValue(2);
        for (Integer e : list2) {
            System.out.println(e);
        }


    }
}
