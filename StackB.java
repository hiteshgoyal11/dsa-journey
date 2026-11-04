import java.util.*;
public class StackB {

    // Stack using arraylist
    // static class StackB {
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty() {
    //         return list.size() == 0;
    //     }

    //     // push
    //     public static void push(int data) {
    //         list.add(data);
    //     }

    //     // pop
    //     public static int pop() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }

    //     // peek
    //     public static int peek() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         return list.get(list.size()-1);
    //     }
    // }



    // Stack using linkedlist
    // static class Node {
    //     int data;
    //     Node next;
    //     Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    // static class StackB {
    //     static Node head = null;

    //     public static boolean isEmpty() {
    //         return head == null;
    //     }

    //     // push
    //     public static void push(int data) {
    //         Node newNode = new Node(data);
    //         if(isEmpty()) {
    //             head = newNode;
    //             return;
    //         }

    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     // pop
    //     public static int pop() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }

    //     // peek
    //     public static int peek() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }



    // Q1 push at bottom of stack
    // public static void pushAtBottom(Stack<Integer> s, int data) {
    //     if(s.isEmpty()) {
    //         s.push(data);
    //         return;
    //     }
    //     int top = s.pop();
    //     pushAtBottom(s, data);
    //     s.push(top);
    // }



    // Q2 reverse a string using stack
    // public static String reverseString(String str) {
    //     Stack<Character> s = new Stack<>();
    //     int idx = 0;
    //     while(idx < str.length()) {
    //         s.push(str.charAt(idx));
    //         idx++;
    //     }

    //     StringBuilder result = new StringBuilder("");
    //     while(!s.isEmpty()) {
    //         char curr = s.pop();
    //         result.append(curr);
    //     }

    //     return result.toString();
    // }



    // Q3 reverse a stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String args[]) {
        // Stack using arraylist
        // StackB s = new StackB();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while(!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }



        // Stack using linkedlist
        // StackB s = new StackB();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while(!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }



        // Stack using collections framework
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while(!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }



        // Q1 push at bottom of stack
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 4);
        // while(!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }



        // Q2 reverse a string using stack
        // String str = "abc";
        // System.out.println(reverseString(str));



        // Q3 reverse a stack
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        printStack(s);
    }
}
