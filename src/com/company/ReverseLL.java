package com.company;

// Java program for reversing the linked list 

public class ReverseLL {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Function to reverse the linked list */
    Node reverse(Node node) {
        Node prev = null, curr = null, head = node;
        while(head != null) {
            curr = head;
            head = head.next;
            curr.next = prev;
            prev = curr;
        }
        return curr;
    }

    public boolean isPalindrome(Node head) {
        if(head == null || head.next==null)
            return true;

        int sum = 0, i = 0;
        while(head != null) {
            if(i==0) {
                sum+=Math.abs(head.data);
                head = head.next;
                i=1;
            } else {
                sum-=Math.abs(head.data);
                head = head.next;
                i=0;
            }
        }

        return sum == 0;
    }

    // prints content of double linked list 
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.head = new Node(-129);
        list.head.next = new Node(-129);
//        list.head.next.next = new Node(4);
//        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
//        head = list.reverse(head);
//        System.out.println("");
//        System.out.println("Reversed linked list ");
//        list.printList(head);
        System.out.println(list.isPalindrome(head));
    }
} 