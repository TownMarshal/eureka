package datastructure.singlylinkedlist;

//单向链表类
public class SinglyLinkedList {
    private Node head;//头指针

    //节点类
    private static class Node {
        int value;//值
        Node next;//下一个几点指针

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

}
