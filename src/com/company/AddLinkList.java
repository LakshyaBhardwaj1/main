package com.company;

// Java program to add two numbers
// represented by linked list 

public class AddLinkList {

    static Node head1, head2;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Adds contents of two linked  
lists and return the head node  
of resultant list */
    Node addTwoLists(Node l1, Node l2)
    {
        Node head = null, curr = null;
        int carry = 0, sum = 0, ans = 0;
        boolean hasHead = false;

        while(l1 != null || l2 != null) {
            sum = (l1 != null ? l1.data : 0) +
                    (l2 != null ? l2.data : 0);
            if (carry != 0) {
                sum += carry;
            }
            carry = sum / 10;
            ans = sum % 10;
            Node l3 = new Node(ans);

            if (!hasHead) {
                head = l3;
                hasHead = true;
                curr = head;
            } else {
                curr.next = l3;
                curr = curr.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry>0) {
            curr.next = new Node(carry);;
        }

        return head;
    }
    /* Utility function to print a linked list */

    void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        AddLinkList list = new AddLinkList();

        // creating first list 
        list.head1 = new Node(2);
        list.head1.next = new Node(4);
        list.head1.next.next = new Node(7);
        list.head1.next.next.next = new Node(8);
        System.out.print("First List is ");
        list.printList(head1);

        // creating seconnd list 
        list.head2 = new Node(5);
        list.head2.next = new Node(6);

        System.out.print("Second List is ");
        list.printList(head2);

        // add the two lists and see the result 
        Node rs = list.addTwoLists(head1, head2);
        System.out.print("Resultant List is ");
        list.printList(rs);
    }
} 