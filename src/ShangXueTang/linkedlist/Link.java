package ShangXueTang.linkedlist;

import java.util.HashMap;

/**
 * 链表操作
 * https://www.cnblogs.com/luego/p/11421590.html
 * https://blog.csdn.net/wanf425/article/details/83048761
 * @param <T>
 */
public class Link<T> {

    static SingleNode<Integer> s1 = null;
    static SingleNode<Integer> s2 = null;
    static SingleNode<Integer> s3 = null;
    static SingleNode<Integer> s4 = null;
    static SingleNode<Integer> s5 = null;
    static SingleNode<Integer> s6 = null;
    /**
     * 寻找链表的中间节点
     * @param headNode 节点
     * @return SingleNode
     */
    public static SingleNode<Integer> findMiddle(SingleNode<Integer> headNode){
        if (headNode == null || headNode.next == null){
            return headNode;
        }
        SingleNode<Integer> pNode = headNode;
        SingleNode<Integer> qNode = headNode.next;

        //使用快慢指针方法
        while (qNode != null && qNode.next != null){
            pNode = pNode.next;
            qNode = qNode.next.next;
        }

        return pNode;
    }

    /**
     * 校验寻找中间节点
     */
    public static void verifyFindMiddle(){
        s1 = new SingleNode(1);
        s2 = new SingleNode(2);
        s3 = new SingleNode(3);
        s4 = new SingleNode(4);
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = null;
        printLink(findMiddle(s1));
    }

    /**
     * 删除倒数第n个节点
     * @param headNode 节点
     * @param n 第几个
     * @return SingleNode
     */
    public static SingleNode<Integer> removeNode(SingleNode<Integer> headNode, int n){
        if(headNode == null){
            return null;
        }
        SingleNode<Integer> pNode = headNode;
        SingleNode<Integer> qNode = headNode;

        //找到删除的是哪个
        int i=0;
        while (i < n || n <= 0){
            pNode = pNode.next;

            if (pNode == null){
                headNode = headNode.next;
                return headNode;
            }

            i++;
        }

        while (pNode.next != null) {
            pNode = pNode.next;
            qNode = qNode.next;
        }

        qNode.next = qNode.next.next;

        return headNode;
    }

    /**
     * 删除倒数第n个节点
     */
    public static void verifyRemoveNode(){
        s1 = new SingleNode<>(1);
        s2 = new SingleNode<>(2);
        s3 = new SingleNode<>(3);
        s4 = new SingleNode<>(4);
        s5 = new SingleNode<>(5);

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = null;

        printLink(removeNode(s1,3));
    }

    /**
     * 链表反转，通过递归的方式
     * @param node 节点
     * @return SingleNode
     */
    public static SingleNode<Integer> reverseV1 (SingleNode<Integer> node){
        if (node == null || node.next == null){
            return node;
        } else {
            SingleNode<Integer> pnow = node;
            SingleNode<Integer> ppre = null;
            SingleNode<Integer> pnext = null;
            SingleNode<Integer> newHead = null;

            while (pnow != null){
                pnext = pnow.next;
                if (pnext == null){
                    newHead = pnow;
                }
                pnow.next = ppre;
                ppre = pnow;
                pnow = pnext;
            }

            return newHead;
        }
    }

    /**
     * 单链表反转 版本二
     * ① 递归的终止条件：找到尾节点
     * ② 前后相邻两个过程的关系：原来后一个节点的next指针指向前一个节点
     * @param node 节点
     * @return SingleNode
     */
    public static SingleNode<Integer> reverseV2(SingleNode<Integer> node){
        if (node == null || node.next == null){
            return node;
        } else {
            SingleNode<Integer> headNode = reverseV2(node.next);
            node.next.next = node;
            node.next = null;
            return headNode;
        }
    }

    /**
     * 单链表反转
     */
    private static void verifySingleNodeReverse1() {
        s1 = new SingleNode<>(1);
        s2 = new SingleNode<>(2);
        s3 = new SingleNode<>(3);
        s4 = new SingleNode<>(4);
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;

        SingleNode<Integer> firstNode = reverseV1(s1);
        printLink(firstNode);
    }

    private static void verifySingleNodeReverse2() {
        s1 = new SingleNode<>(1);
        s2 = new SingleNode<>(2);
        s3 = new SingleNode<>(3);
        s4 = new SingleNode<>(4);

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;

        SingleNode<Integer> firstNode = reverseV2(s1);
        printLink(firstNode);
    }

    /**
     * 判断链表中是否存在环： 快慢指针法
     * @param headNode 头节点
     * @return boolean
     */
    public static boolean hasLoopV1 (SingleNode<Integer> headNode){
        if(headNode == null){
            return false;
        }

        SingleNode<Integer> p = headNode;
        SingleNode<Integer> q = headNode.next;

        //快指针未能遍历所有的节点
        while (q != null && q.next != null){
            p = p.next; //遍历一个节点
            q = q.next.next; //遍历两个节点

            //已到链表末尾
            if (q == null){
                return false;
            } else if (p == q){
                //快慢指针相遇，存在环
                return true;
            }
        }

        return false;
    }


    private static HashMap<SingleNode<Integer>, Integer> nodeMap = new HashMap<>();

    /**
     * 判断链表中是否存在环： 足迹法
     * 使用的方法是有环的话，肯定会重复走某一节点
     * @param node 头节点
     * @param index 标记
     * @return boolean
     */
    public static boolean hasLoopV2(SingleNode<Integer> node, int index){
        if (node == null || node.next == null){
            return false;
        }
        if (nodeMap.containsKey(node)){
            return true;
        } else {
            nodeMap.put(node, index);
            return hasLoopV2(node.next, ++index);
        }
    }

    /**
     * 校验是否有环
     */
    private static void verifyLoop1() {
        s1 = new SingleNode<>(1);
        s2 = new SingleNode<>(2);
        s3 = new SingleNode<>(3);
        s4 = new SingleNode<>(3);
        s5 = new SingleNode<>(3);
        s6 = new SingleNode<>(3);

        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        s6.next = s3;

        System.out.println(hasLoopV1(s1));
    }

    public static void verifyLoop2() {
        SingleNode<Integer> s1 = new SingleNode<>(1);
        SingleNode<Integer> s2 = new SingleNode<>(2);
        SingleNode<Integer> s3 = new SingleNode<>(3);
        SingleNode<Integer> s4 = new SingleNode<>(3);
        SingleNode<Integer> s5 = new SingleNode<>(3);
        SingleNode<Integer> s6 = new SingleNode<>(3);
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;
        s6.next = s3;

        System.out.println(hasLoopV2(s1, 0));
    }

    /**
     * 合并链表，不通过递归的方式
     * @param nodeA 第一个链表的头节点
     * @param nodeB 第二个链表的头节点
     * @return SingleNode
     */
    public static SingleNode<Integer> mergeV1(SingleNode<Integer> nodeA, SingleNode<Integer> nodeB){
        if (nodeA == null){
            return nodeB;
        } else if (nodeB == null){
            return nodeA;
        }

        //初始化nodeC
        SingleNode<Integer> nodeC = new SingleNode(null);
        //定义当前节点
        SingleNode<Integer> currentNode = nodeC;

        //遍历A和B，知道末尾
        while (nodeA != null ||nodeB != null){
            SingleNode<Integer> nextNode = new SingleNode<>(null);
            //找出较小的节点
            if (compareNode(nodeA, nodeB) <= 0){
                nextNode.data = nodeA.data;
                nodeA = nodeA.next;
            } else {
                nextNode.data = nodeB.data;
                nodeB = nodeB.next;
            }

            //添加较小的节点
            currentNode.next = nextNode;
            currentNode = currentNode.next;
        }
        //去掉没有用的头节点
        nodeC = nodeC.next;

        return nodeC;
    }

    /**
     * 使用递归方式合并链表
     * @param nodeA 第一个链表的头节点
     * @param nodeB 第二个链表的头节点
     * @return SingleNode
     */
    public static SingleNode<Integer> mergeV2(SingleNode<Integer> nodeA, SingleNode<Integer> nodeB) {
        if (nodeA == null) {
            return nodeB;
        } else if (nodeB == null) {
            return nodeA;
        }

        // 找出较小的节点
        if (compareNode(nodeA, nodeB) <= 0) {
            nodeA.next = mergeV2(nodeA.next, nodeB);
            return nodeA;
        } else {
            nodeB.next = mergeV2(nodeA, nodeB.next);
            return nodeB;
        }
    }

    /**
     * 校验合并链表
     */
    private static void verifyMerge() {
        SingleNode<Integer> s1 = new SingleNode<>(1);
        SingleNode<Integer> s2 = new SingleNode<>(2);
        SingleNode<Integer> s3 = new SingleNode<>(9);
        s1.next = s2;
        s2.next = s3;

        SingleNode<Integer> n1 = new SingleNode<>(3);
        SingleNode<Integer> n2 = new SingleNode<>(4);
        SingleNode<Integer> n3 = new SingleNode<>(7);
        SingleNode<Integer> n4 = new SingleNode<>(8);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        printLink(mergeV1(s1, n1));
        printLink(mergeV2(s1, n1));
    }

    /**
     * 打印链表
     * @param node 头节点
     */
    public static void printLink(SingleNode<Integer> node){
        System.out.println("current node data:" + node.data + ", next node data: " + node.getNextNodeData());

        if (node.next != null){
            printLink(node.next);
        } else {
            System.out.println("-------------------------");
        }
    }

    /**
     * 比较大小，找出较小的节点
     * @param node1 第一个链表的头节点
     * @param node2 第二个链表的头节点
     * @return int
     */
    public static int compareNode(SingleNode<Integer> node1, SingleNode<Integer> node2){
        if (node1 == null){
            return 1;
        } else if (node2 == null){
            return -1;
        }
        if (node1.data == null){
            return -1;
        } else if (node2.data == null){
            return 1;
        }

        return node1.data.compareTo(node2.data);
    }


    public static void main(String[] args) {
        System.out.println("中间节点");
        //找出中间节点
        verifyFindMiddle();
        System.out.println("移除某一个节点");
        //移除某一个节点
        verifyRemoveNode();
        System.out.println("判断链表是否有环");
        //判断是否链表中是否有环
        //1.快慢针
        verifyLoop1();
        //2.足迹法
        verifyLoop2();
        System.out.println("-------------------------");
        System.out.println("合并链表");
        //合并
        verifyMerge();
        System.out.println("反转链表");
        //反转
        verifySingleNodeReverse1();
        verifySingleNodeReverse2();
    }
}

/**
 * 单链表节点
 * @param <T>
 */
class SingleNode<T>{
    public SingleNode<T> next;
    public T data;

    public SingleNode(T data) {
        this.data = data;
    }

    public T getNextNodeData(){
        return next != null ? next.data : null;
    }

}