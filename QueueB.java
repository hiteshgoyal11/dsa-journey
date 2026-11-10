import java.util.*;
public class QueueB {

    // Q1 Queue using linkedlist
    // static class Node {

    //     int data;
    //     Node next;
        
    //     Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }



    // Queue Implementation from scratch
    // static class Queue {
        // static int arr[];
        // static int size;
        // static int rear;
        // static int front;

        // Queue(int n) {
        //     arr = new int[n];
        //     size = n;
        //     rear = -1;

        // }

        // public static boolean isEmpty() {
        //     return rear == -1;
        // }

        // // add
        // public static void add(int data) {
        //     if(rear == size-1) {
        //         System.out.println("queue is full");
        //         return;
        //     }

        //     rear = rear + 1;
        //     arr[rear] = data;
        // }

        // // remove
        // public static int remove() {
        //     if(isEmpty()) {
        //         System.out.println("empty queue");
        //         return -1;
        //     }

        //     int front = arr[0];
        //     for(int i=0; i<size-1; i++) {
        //         arr[i] = arr[i+1];
        //     }
        //     rear = rear - 1;
        //     return front;
        // }

        // // peek
        // public static int peek() {
        //     if(isEmpty()) {
        //         System.out.println("empty queue");
        //         return -1;
        //     }
        //     return arr[0];
        // }



        // Circular Queue
        // Queue(int n) {
        //     arr = new int[n];
        //     size = n;
        //     rear = -1;
        //     front = -1;
        // }

        // public static boolean isEmpty() {
        //     return front == -1 && rear == -1;
        // }

        // public static boolean isFull() {
        //     return (rear+1)%size == front;
        // }

        // // add
        // public static void add(int data) {
        //     if(isFull()) {
        //         System.out.println("queue is full");
        //     }

        //     // add
        //     if(front == -1) {
        //         front = 0;
        //     }
        //     rear = (rear+1)%size;
        //     arr[rear] = data;
        // }

        // // remove
        // public static int remove() {
        //     if(isEmpty()) {
        //         System.out.println("empty queue");
        //         return -1;
        //     }
        //     int result = arr[front];
        //     // last element
        //     if(rear == front) {
        //         rear = front = -1;
        //     } else {
        //         front = (front+1)%size;
        //     }
        //     return result;
        // }

        // // peek
        // public static int peek() {
        //     if(isEmpty()) {
        //         System.out.println("empty queue");
        //         return -1;
        //     }

        //     return arr[front];
        // }



        // Q1 Queue using linkedlist
        // static Node head = null;
        // static Node tail = null;

        // public static boolean isEmpty() {
        //     return head == null && tail == null;
        // }

        // // add
        // public static void add(int data) {
        //     Node newNode = new Node(data);
        //     if(head == null) {
        //         head = tail = newNode;
        //         return;
        //     }
        //     tail.next = newNode;
        //     tail = newNode;
        // }

        // // remove
        // public static int remove() {
        //     if(isEmpty()) {
        //         System.out.println("queue empty");
        //         return -1;
        //     }

        //     int front = head.data;
        //     if(tail == head) {
        //         tail = head = null;
        //     }
        //     head = head.next;
        //     return front;
        // }

        // // peek
        // public static int peek() {
        //     if(isEmpty()) {
        //         System.out.println("queue empty");
        //         return -1;
        //     }

        //     return head.data;
        // }
    // }



    // Q2 Queue using two stacks
    // static class Queue {
    //     static Stack<Integer> s1 = new Stack<>();
    //     static Stack<Integer> s2 = new Stack<>();

    //     public static boolean isEmpty() {
    //         return s1.isEmpty();
    //     }

    //     //add
    //     public static void add(int data) {
    //         while(!s1.isEmpty()) {
    //             s2.push(s1.pop());
    //         }

    //         s1.push(data);

    //         while(!s2.isEmpty()) {
    //             s1.push(s2.pop());
    //         }
    //     }

    //     //remove
    //     public static int remove() {
    //         if(s1.isEmpty()) {
    //             System.out.println("queue empty");
    //         }

    //         return s1.pop();
    //     }

    //     //peek
    //     public static int peek() {
    //         if(s1.isEmpty()) {
    //             System.out.println("queue empty");
    //         }

    //         return s1.peek();
    //     }
    // }



    // Q3 stack using 2 queues
    // static class Stack {
    //     static Queue<Integer> q1 = new LinkedList<>();
    //     static Queue<Integer> q2 = new LinkedList<>();

    //     public static boolean isEmpty() {
    //         return q1.isEmpty() && q2.isEmpty();
    //     }

    //     //push
    //     public static void push(int data) {
    //         if(!q1.isEmpty()) {
    //             q1.add(data);
    //         } else {
    //             q2.add(data);
    //         }
    //     }

    //     //pop
    //     public static int pop() {
    //         if(isEmpty()) {
    //             System.out.println("empty queue");
    //             return -1;
    //         }
    //         int top = -1;
    //         //case 1
    //         if(!q1.isEmpty()) {
    //             while(!q1.isEmpty()) {
    //                 top = q1.remove();
    //                 if(q1.isEmpty()) {
    //                     break;
    //                 }
    //                 q2.add(top);
    //             }
    //         } else { //case 2
    //             while(!q2.isEmpty()) {
    //                 top = q2.remove();
    //                 if(q2.isEmpty()) {
    //                     break;
    //                 }
    //                 q1.add(top);
    //             }
    //         }
    //         return top;
    //     }

    //     //peek
    //     public static int peek() {
    //         if(isEmpty()) {
    //             System.out.println("empty queue");
    //             return -1;
    //         }
    //         int top = -1;
    //         //case 1
    //         if(!q1.isEmpty()) {
    //             while(!q1.isEmpty()) {
    //                 top = q1.remove();
    //                 q2.add(top);
    //             }
    //         } else { //case 2
    //             while(!q2.isEmpty()) {
    //                 top = q2.remove();
    //                 q1.add(top);
    //             }
    //         }
    //         return top;
    //     }
    // }



    //Q4 first non repeating leeter in a stream of characters
    // public static void printNonRepeating(String str) {
    //     int freq[] = new int[26];
    //     Queue<Character> q = new LinkedList<>();

    //     for(int i=0; i<str.length(); i++) {
    //         char ch = str.charAt(i);
    //         q.add(ch);
    //         freq[ch-'a']++;

    //         while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
    //             q.remove();
    //         }
    //         if(q.isEmpty()) {
    //             System.out.print(-1+ " ");
    //         } else {
    //             System.out.print(q.peek()+ " ");
    //         }
    //     }
    // }



    // Q5 Interleave 2 halves of a queue (even length)
    // public static void interLeave(Queue<Integer> q) {
    //     Queue<Integer> firstHalf = new LinkedList<>();
    //     int size = q.size();

    //     for(int i=0; i<size/2; i++) {
    //         firstHalf.add(q.remove());
    //     }

    //     while(!firstHalf.isEmpty()) {
    //         q.add(firstHalf.remove());
    //         q.add(q.remove());
    //     }
    // }



    // Q6 Queue reversal
    // public static void reverse(Queue<Integer> q) {
    //     Stack<Integer> s = new Stack<>();

    //     while(!q.isEmpty()) {
    //         s.push(q.remove());
    //     }

    //     while(!s.isEmpty()) {
    //         q.add(s.pop());
    //     }
    // }
    

    public static void main(String args[]) {
        // Queue q = new Queue(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }



        // Circular queue
        // Queue q = new Queue(3);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // System.out.println(q.remove());
        // q.add(4);
        // System.out.println(q.remove());

        // while(!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }



        // Q1 queue using linkedlist
        // Queue q = new Queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }



        // Queue using jcf
        // Queue<Integer> q = new LinkedList<>();

        // Queue<Integer> q = new ArrayDequeue<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }



        // Q2 Queue using two stacks
        // Queue q = new Queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }



        // Q3 stack using 2 queues
        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while(!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }



        //Q4 first non repeating leeter in a stream of characters
        // String str = "aabccxb";
        // printNonRepeating(str);



        // Q5 Interleave 2 halves of a queue (even length)
        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // q.add(6);
        // q.add(7);
        // q.add(8);
        // q.add(9);
        // q.add(10);

        // interLeave(q);
        // // print
        // while(!q.isEmpty()) {
        //     System.out.print(q.remove()+ " ");
        // }



        // Q6 Queue reversal
        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);

        // reverse(q);
        // while(!q.isEmpty()) {
        //     System.out.print(q.remove()+ " ");
        // }



        // Deque
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); // 1
        deque.addFirst(2); // 2 1
        deque.addLast(3); // 2 1 3
        deque.addLast(4); // 2 1 3 4
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque.getFirst());
    }
}