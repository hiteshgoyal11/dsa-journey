// import java.util.LinkedList;
public class LinkedList<E> extends java.util.LinkedList<E> {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    // add first
    public void addFirst(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode next = head
        newNode.next = head; //link

        // step3 - head = newNode
        head = newNode;
    }


    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    // print
    public void print() { //0(n)
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // add in middle
    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }


    // remove first
    // public int removeFirst() {
    //     if(size == 0) {
    //         System.out.println("LL is empty");
    //         return Integer.MIN_VALUE;
    //     } else if(size == 1) {
    //         int val = head.data;
    //         head = tail = null;
    //         size = 0;
    //         return val;
    //     }
    //     int val = head.data;
    //     head = head.next;
    //     size--;
    //     return val;
    // }


    // remove last
    // public int removeLast() {
    //     if(size == 0) {
    //         System.out.println("LL is empty");
    //         return Integer.MIN_VALUE;
    //     } else if(size == 1) {
    //         int val = head.data;
    //         head = tail = null;
    //         size = 0;
    //         return val;
    //     }
    //     // prev : i = size-2
    //     Node prev = head;
    //     for(int i=0; i<size-2; i++) {
    //         prev = prev.next;
    //     }
    //     int val = prev.next.data;
    //     prev.next = null;
    //     tail = prev;
    //     size--;
    //     return val;
    // }


    // search
    // public int itrSearch(int key) { //0(n)
    //     Node temp = head;
    //     int i = 0;

    //     while(temp != null) {
    //         if(temp.data == key) { //key found
    //             return i;
    //         }
    //         temp = temp.next;
    //         i++;
    //     }

    //     // key not found
    //     return -1;
    // }


    // recursive search
    // public int helper(Node head, int key) { //0(n)
    //     if(head == null) {
    //         return -1;
    //     }

    //     if(head.data == key) {
    //         return 0;
    //     }
    //     int idx = helper(head.next, key);
    //     if(idx == -1) {
    //         return -1;
    //     }

    //     return idx+1;
    // }
    // public int recSearch(int key) {
    //     return helper(head, key);
    // }


    // reverse
    // public void reverse() {
    //     Node prev = null;
    //     Node curr = tail = head;
    //     Node next;

    //     while(curr != null) {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     head = prev;
    // }


    // delete nth node from end
    // public void deleteNthfromEnd(int n) {
    //     // calculate size
    //     int sz = 0;
    //     Node temp = head;
    //     while(temp != null) {
    //         temp = temp.next;
    //         sz++;
    //     }

    //     if(n == sz) {
    //         head = head.next; //removefirst
    //         return;
    //     }

    //     // sz-n
    //     int i = 1;
    //     int iToFind = sz-n;
    //     Node prev = head;
    //     while(i < iToFind) {
    //         prev = prev.next;
    //         i++;
    //     }

    //     prev.next = prev.next.next;
    //     return;
    // }


    // slow-fast approach
    // public Node findMid(Node head) {
    //     Node slow = head;
    //     Node fast = head;

    //     while(fast != null && fast.next != null) {
    //         slow = slow.next; //+1
    //         fast = fast.next.next; //+2
    //     }
    //     return slow; //slow is my middle
    // }


    // public boolean checkPalindrome() {
    //     if(head == null || head.next == null) {
    //         return true;
    //     }
    //     // step1 - find mid
    //     Node midNode = findMid(head);

    //     // step2 - reverse 2nd half
    //     Node prev = null;
    //     Node curr = midNode;
    //     Node next;
    //     while(curr != null) {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }

    //     Node right = prev;//right half head
    //     Node left = head;
    //     // step3 - check left half & right half
    //     while(right != null) {
    //         if(left.data != right.data) {
    //             return false;
    //         }
    //         left = left.next;
    //         right = right.next;
    //     }
    //     return true;
    // }


    // Detect a loop/cycle in a LL
    // public static boolean isCycle() { //floyd's Cycle finding
    //     Node slow = head;
    //     Node fast = head;
        
    //     while(fast != null && fast.next != null) {
    //         slow = slow.next; //+1
    //         fast = fast.next.next; //+2
    //         if(slow == fast) {
    //             return true; //cycle exists
    //         }
    //     }
    //     return false;
    // }


    // Remove a loop/cycle in a LL
    // public static void removeCycle() {
    //     // detect cycle
    //     Node slow = head;
    //     Node fast = head;
    //     boolean cycle = false;
    //     while(fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if(slow == fast) {
    //             cycle = true;
    //             break;
    //         }
    //     }
    //     if(cycle == false) {
    //         return;
    //     }
    //     // find meeting point
    //     slow = head;
    //     Node prev = null;
    //     while(slow != fast) {
    //         prev = fast;
    //         slow = slow.next;
    //         fast = fast.next;
    //     }
    //     // remove cycle -> last.next = null
    //     prev.next = null;
    // }



    // Merge sort on a Linked List
    // private Node getMid(Node head) {
    //     Node slow = head;
    //     Node fast = head.next;
    //     while(fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow; //mid node
    // }

    // private Node merge(Node head1, Node head2) {
    //     Node mergedLL = new Node(-1);
    //     Node temp = mergedLL;

    //     while(head1 != null && head2 != null) {
    //         if(head1.data <= head2.data) {
    //             temp.next = head1;
    //             head1 = head1.next;
    //             temp = temp.next;
    //         } else {
    //             temp.next = head2;
    //             head2 = head2.next;
    //             temp = temp.next;
    //         }
    //     }

    //     while(head1 != null) {
    //         temp.next = head1;
    //         head1 = head1.next;
    //         temp = temp.next;
    //     }

    //     while(head2 != null) {
    //         temp.next = head2;
    //         head2 = head2.next;
    //         temp = temp.next;
    //     }
    //     return mergedLL.next;
    // }
    // public Node mergeSort(Node head) {
    //     Node sortedHead = mergeSortNodes(head);
    //     if(head == this.head) {
    //         tail = sortedHead;
    //         while(tail != null && tail.next != null) {
    //             tail = tail.next;
    //         }
    //     }
    //     return sortedHead;
    // }

    // private Node mergeSortNodes(Node head) {
    //     if(head == null || head.next == null) {
    //         return head;
    //     }
    //     // find mid
    //     Node mid = getMid(head);
    //     // left & right MS
    //     Node rightHead = mid.next;
    //     mid.next = null;
    //     Node newLeft = mergeSortNodes(head);
    //     Node newRight = mergeSortNodes(rightHead);
    //     // merge
    //     return merge(newLeft, newRight);
    // }



    // zig-zag linked list
    // public void zigzag() {
    //     // find mid
    //     Node slow = head;
    //     Node fast = head.next;
    //     while(fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     Node mid = slow;

    //     // reverse 2nd half
    //     Node curr = mid.next;
    //     mid.next = null;
    //     Node prev = null;
    //     Node next;

    //     while(curr != null) {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }

    //     Node left = head;
    //     Node right = prev;
    //     Node nextL, nextR;

    //     // alternate merge - zig-zag merge
    //     while(left != null && right != null) {
    //         nextL = left.next;
    //         left.next = right;
    //         nextR = right.next;
    //         right.next = nextL;

    //         left = nextL;
    //         right = nextR;
    //     }
    // }

    public static void main(String args[]) {
        // LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);

        // ll.print(); //1->2->3->4->5->


        // size
        // System.out.println(ll.size);


        // Remove first
        // ll.removeFirst();
        // ll.print();


        // Remove last
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);


        // iterative search
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));


        // recursive search
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));


        // reverse
        // ll.reverse();
        // ll.print();


        // delete nth node from end
        // ll.deleteNthfromEnd(3);
        // ll.print();


        // check palindrome
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addLast(1);
        // System.out.println(ll.checkPalindrome());


        // Detect a loop/cycle in a LL
        // head = new Node(1);
        // head.next = new Node(2);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // 1->2->3->2
        // System.out.println(isCycle());


        // remove a loop/cycle in a LL
        // removeCycle();
        // System.out.println(isCycle());



        // LL in java collections framework
        // create -
        // LinkedList<Integer> ll = new LinkedList<>();

        // add
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addFirst(0);
        // 0->1->2
        // System.out.println(ll);
        // // remove
        // ll.removeLast();
        // ll.removeFirst();
        // System.out.println(ll);



        // Merge Sort on Linked List 0(nlogn)
        // LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // // 5->4->3->2->1
        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();



        // zig-zag linked list
        // LinkedList ll = new LinkedList();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // // 1->2->3->4->5
        // ll.print();
        // ll.zigzag();
        // ll.print();
    }
}
