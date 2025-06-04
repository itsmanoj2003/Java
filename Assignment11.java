package Training;

import java.util.PriorityQueue;


//1st Program
//class Node {
//    int data;
//    Node next;
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class mergeList {
//    Node head;
//
//    void add(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
//        }
//    }
//
//    void print() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " --> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    static Node mergeTwoLists(Node l1, Node l2) {
//        Node dummy = new Node(0);
//        Node tail = dummy;
//
//        while (l1 != null && l2 != null) {
//            if (l1.data < l2.data) {
//                tail.next = l1;
//                l1 = l1.next;
//            } else {
//                tail.next = l2;
//                l2 = l2.next;
//            }
//            tail = tail.next;
//        }
//
//        tail.next = (l1 != null) ? l1 : l2;
//        return dummy.next;
//    }
//
//    static Node mergeKLists(Node[] lists) {
//        if (lists.length == 0) return null;
//        Node merged = lists[0];
//        for (int i = 1; i < lists.length; i++) {
//            merged = mergeTwoLists(merged, lists[i]);
//        }
//        return merged;
//    }
//}
//
//public class Assignment11 {
//    public static void main(String[] args) {
//        mergeList list1 = new mergeList();
//        list1.add(1);
//        list1.add(4);
//        list1.add(5);
//        list1.print();
//
//        mergeList list2 = new mergeList();
//        list2.add(1);
//        list2.add(3);
//        list2.add(4);
//        list2.print();
//
//        mergeList list3 = new mergeList();
//        list3.add(2);
//        list3.add(6);
//        list3.print();
//
//        Node[] allLists = {list1.head, list2.head, list3.head};
//        Node mergedHead = mergeList.mergeKLists(allLists);
//
//        Node temp = mergedHead;
//        while (temp != null) {
//            System.out.print(temp.data + " --> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//}







//2nd Program
//class Node {
//    int data;
//    Node next;
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList {
//    Node head;
//
//    void add(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = newNode;
//    }
//
//    void printList() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    static void deleteNode(Node node) {
//        node.data = node.next.data;
//        node.next = node.next.next;
//    }
//}
//
//public class Assignment11 {
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.add(4);
//        list.add(5);
//        list.add(1);
//        list.add(9);
//
//        System.out.print("Before deletion: ");
//        list.printList();
//
//        Node temp = list.head;
//        while (temp != null && temp.data != 5) {
//            temp = temp.next;
//        }
//
//        if (temp != null) {
//            LinkedList.deleteNode(temp);
//        }
//
//        System.out.print("After deletion: ");
//        list.printList();
//    }
//}




//3rd Program
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Skip duplicate
            } else {
                current = current.next;
            }
        }
    }


    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Assignment11 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(1);
        list.add(2);

        System.out.print("Before: ");
        list.printList();

        list.removeDuplicates();

        System.out.print("After: ");
        list.printList();
    }
}
