// Implement merge sort for doubly linked list

class LinkedList { 
  
    static Node head;  // head of list 
  
    /* Node Class */
    static class Node { 
  
        int data; 
        Node next, prev; 
  
        // Constructor to create a new node 
        Node(int d) { 
            data = d; 
            next = prev = null; 
        } 
    } 
  

    void print(Node node) { 
        Node temp = node; 
        
        while (node != null) { 
            System.out.print(node.data + " "); 
            temp = node; 
            node = node.next; 
        } 
     
    } 
  
    // Split a doubly linked list (DLL) into 2 DLLs of 
    // half sizes 
    Node split(Node head) { 
        Node fast = head, slow = head; 
        while (fast.next != null && fast.next.next != null) { 
            fast = fast.next.next; 
            slow = slow.next; 
        } 
	 Node temp = slow.next; 
        slow.next = null; 
        return temp; 
    } 
  
    Node mergeSort(Node node) { 
        if (node == null || node.next == null) { 
            return node; 
        } 
        Node second = split(node); 
  
        // Recur for left and right halves 
        node = mergeSort(node); 
        second = mergeSort(second); 
  
        // Merge the two sorted halves 
        return merge(node, second); 
    } 
  
    // Function to merge two linked lists 
    Node merge(Node first, Node second) { 
        // If first linked list is empty 
        if (first == null) { 
            return second; 
        } 

 // If second linked list is empty 
        if (second == null) { 
            return first; 
        } 
  
        // Pick the smaller value 
        if (first.data < second.data) { 
            first.next = merge(first.next, second); 
            first.next.prev = first; 
            first.prev = null; 
            return first; 
        } else { 
            second.next = merge(first, second.next); 
            second.next.prev = second; 
            second.prev = null; 
            return second; 
        } 
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args) { 
   LinkedList list = new LinkedList(); 
        list.head = new Node(10); 
        list.head.next = new Node(12); 
        list.head.next.next = new Node(3); 
        list.head.next.next.next = new Node(11); 
     
          
          
        Node node = null; 
        node = list.mergeSort(head); 
        System.out.println("Linked list after sorting :"); 
        list.print(node); 
  
    } 
} 