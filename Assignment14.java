package Training;

import java.util.Scanner;
import java.util.Stack;


//  1st Program
//public class Assignment14 {
//
//    static final int SIZE = 100;
//    int[] queue = new int[SIZE];
//    int front = -1;
//    int rear = -1;
//
//    void enqueue(int data) {
//        if (rear == SIZE - 1) {
//            System.out.println("Queue Overflow");
//            return;
//        }
//        if (front == -1) front = 0;
//        queue[++rear] = data;
//        System.out.println(data + " enqueued");
//    }
//
//    // Dequeue - remove element from front
//    void dequeue() {
//        if (front == -1 || front > rear) {
//            System.out.println("Queue Underflow");
//            return;
//        }
//        System.out.println(queue[front] + " dequeued");
//        front++;
//    }
//
//    void display() {
//        if (front == -1 || front > rear) {
//            System.out.println("Queue is empty");
//            return;
//        }
//        System.out.print("Queue: ");
//        for (int i = front; i <= rear; i++) {
//            System.out.print(queue[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Assignment14 q = new Assignment14();
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter value to enqueue: ");
//                    int val = sc.nextInt();
//                    q.enqueue(val);
//                    break;
//                case 2:
//                    q.dequeue();
//                    break;
//                case 3:
//                    q.display();
//                    break;
//                case 4:
//                    System.out.println("Exiting...");
//                    return;
//                default:
//                    System.out.println("Invalid choice");
//            }
//        }
//    }
//}







//  2nd Program
//public class Assignment14 {
//    class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    Node front = null;
//    Node rear = null;
//
//    void enqueue(int data) {
//        Node newNode = new Node(data);
//        if (rear == null) {
//            front = rear = newNode;
//        } else {
//            rear.next = newNode;
//            rear = newNode;
//        }
//        System.out.println(data + " enqueued");
//    }
//
//    void dequeue() {
//        if (front == null) {
//            System.out.println("Queue Underflow");
//            return;
//        }
//        System.out.println(front.data + " dequeued");
//        front = front.next;
//        if (front == null) rear = null;
//    }
//
//    void display() {
//        if (front == null) {
//            System.out.println("Queue is empty");
//            return;
//        }
//        System.out.print("Queue: ");
//        Node temp = front;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Assignment14 q = new Assignment14();
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter value to enqueue: ");
//                    int val = sc.nextInt();
//                    q.enqueue(val);
//                    break;
//                case 2:
//                    q.dequeue();
//                    break;
//                case 3:
//                    q.display();
//                    break;
//                case 4:
//                    System.out.println("Exiting...");
//                    return;
//                default:
//                    System.out.println("Invalid choice");
//            }
//        }
//    }
//}










// 3rd Program

public class Assignment14 {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " enqueued");
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        return val;
    }


    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    void reverseFirstKElements(int k) {
        if (front == null || k <= 0) return;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            if (front != null) {
                stack.push(dequeue());
            }
        }


        while (!stack.isEmpty()) {
            enqueue(stack.pop());
        }

        int size = getSize();
        for (int i = 0; i < size - k; i++) {
            enqueue(dequeue());
        }

        System.out.println("First " + k + " elements reversed.");
    }

    int getSize() {
        int count = 0;
        Node temp = front;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Assignment14 q = new Assignment14();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Reverse First K Elements\n5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    int removed = q.dequeue();
                    if (removed != -1)
                        System.out.println(removed + " dequeued");
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.print("Enter K: ");
                    int k = sc.nextInt();
                    q.reverseFirstKElements(k);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

