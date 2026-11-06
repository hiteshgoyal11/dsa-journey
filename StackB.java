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
    // public static void pushAtBottom(Stack<Integer> s, int data) {
    //     if(s.isEmpty()) {
    //         s.push(data);
    //         return;
    //     }

    //     int top = s.pop();
    //     pushAtBottom(s, data);
    //     s.push(top);
    // }

    // public static void reverseStack(Stack<Integer> s) {
    //     if(s.isEmpty()) {
    //         return;
    //     }
    //     int top = s.pop();
    //     reverseStack(s);
    //     pushAtBottom(s, top);
    // }

    // public static void printStack(Stack<Integer> s) {
    //     while(!s.isEmpty()) {
    //         System.out.println(s.pop());
    //     }
    // }



    // Q4 Stock span problem (Microsoft, flipkart, adobe, samsung, amazon)
    // public static void stockSpan(int stocks[], int span[]) {
    //     Stack<Integer> s = new Stack<>();
    //     span[0] = 1;
    //     s.push(0);

    //     for(int i=1; i<stocks.length; i++) {
    //         int currPrice = stocks[i];
    //         while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
    //             s.pop();
    //         }
    //         if(s.isEmpty()) {
    //             span[i] = i+1;
    //         } else {
    //             int prevHigh = s.peek();
    //             span[i] = i-prevHigh;
    //         }

    //         s.push(i);
    //     }
    // }



    // Valid parentheses
    // public static boolean isValid(String str) {
    //     Stack<Character> s = new Stack<>();

    //     for(int i=0; i<str.length(); i++) {
    //         char ch = str.charAt(i);

    //         // opening
    //         if(ch == '(' || ch == '{' || ch == '[') {
    //             s.push(ch);
    //         } else { //closing
    //             if(s.isEmpty()) {
    //                 return false;
    //             }
    //             if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')) {
    //                 s.pop();
    //             } else {
    //                 return false;
    //             }
    //         }
    //     }
    //     if(s.isEmpty()) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }



    // Duplicate parentheses
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if(count < 1) { //duplicate
                    return true;
                } else { // '('
                    s.pop();
                }
            } else { //opening
                s.push(ch);
            }
        }

        return false;
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
        // Stack<Integer> s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // reverseStack(s);
        // printStack(s);



        // Q4 Stock span problem (Microsoft, flipkart, adobe, samsung, amazon)
        // int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        // int span[] = new int[stocks.length];
        // stockSpan(stocks, span);

        // for(int i=0; i<span.length; i++) {
        //     System.out.print(span[i]+ " ");
        // }



        // Next Greater Element
        // int arr[] = {9, 7, 4, 5, 3, 2};
        // Stack<Integer> s = new Stack<>();
        // int nxtGreater[] = new int[arr.length];

        // for(int i=arr.length-1; i>= 0; i--) {
        //     // 1. while
        //     while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        //         s.pop();
        //     }

        //     // 2. if-else
        //     if(s.isEmpty()) {
        //         nxtGreater[i] = -1;
        //     } else {
        //         nxtGreater[i] = arr[s.peek()];
        //     }

        //     // 3. push element
        //     s.push(i);
        // }

        // for(int i=0; i<nxtGreater.length; i++) {
        //     System.out.print(nxtGreater[i]+ " ");
        // }
        // System.out.println();



        // Valid parentheses
        // String str = "(()[]{})";
        // System.out.println(isValid(str));



        // Duplicate parentheses
        String str = "((a+b))";
        String str2 = "(a-c)";
        System.out.println(isDuplicate(str));

    }
}
