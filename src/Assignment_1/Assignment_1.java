package assignment_1;

import java.util.*;

/*
 * Data Structure Assignment 1
 * Name: اكتب اسمك هنا
 * Group: اكتب الجروب
 */

public class Assignment1 {

    // =========================
    // Q1: Clone an array
    public static int[] cloneArray(int[] arr) {
        return arr.clone();
    }

    // =========================
    // Q2: Remove a random element from an array
    public static int[] removeRandomElement(int[] arr) {
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        return removeElementByIndex(arr, index);
    }

    // =========================
    // Q3: Remove a specific element from an array
    public static int[] removeSpecificElement(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) return arr;
        return removeElementByIndex(arr, index);
    }

    private static int[] removeElementByIndex(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    // =========================
    // Q4: Reverse an array
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // =========================
    // Singly Linked List Node
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    // =========================
    // Q5: Concatenate two linked lists
    public static Node concatenate(Node head1, Node head2) {
        if (head1 == null) return head2;
        Node temp = head1;
        while (temp.next != null) temp = temp.next;
        temp.next = head2;
        return head1;
    }

    // =========================
    // Q6: Rotate linked list right by k
    public static Node rotateRight(Node head, int k) {
        if (head == null) return head;
        Node curr = head;
        int length = 1;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        curr.next = head;
        k = k % length;
        int steps = length - k;
        while (steps-- > 0) curr = curr.next;
        Node newHead = curr.next;
        curr.next = null;
        return newHead;
    }

    // =========================
    // Q7: Search element in singly linked list (position)
    public static int search(Node head, int key) {
        int pos = 0;
        while (head != null) {
            if (head.data == key) return pos;
            head = head.next;
            pos++;
        }
        return -1;
    }

    // =========================
    // Q9: Remove at specific position from singly linked list
    public static Node removeAtPosition(Node head, int pos) {
        if (pos == 0) return head.next;
        Node curr = head;
        for (int i = 0; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr != null && curr.next != null) {
            curr.next = curr.next.next;
        }
        return head;
    }

    // =========================
    // Doubly Linked List Node
    static class DNode {
        int data;
        DNode prev, next;
        DNode(int data) { this.data = data; }
    }

    // =========================
    // Q12: Remove duplicates from doubly linked list
    public static void removeDuplicates(DNode head) {
        HashSet<Integer> set = new HashSet<>();
        DNode curr = head;
        while (curr != null) {
            if (set.contains(curr.data)) {
                curr.prev.next = curr.next;
                if (curr.next != null) curr.next.prev = curr.prev;
            } else {
                set.add(curr.data);
            }
            curr = curr.next;
        }
    }

    // =========================
    // Q13: Traverse doubly linked list in reverse
    public static void traverseReverse(DNode head) {
        if (head == null) return;
        while (head.next != null) head = head.next;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.prev;
        }
    }

    // =========================
    // Q14: Search in doubly linked list
    public static boolean searchDoubly(DNode head, int key) {
        while (head != null) {
            if (head.data == key) return true;
            head = head.next;
        }
        return false;
    }

    // =========================
    // Circular Linked List Node
    static class CNode {
        int data;
        CNode next;
        CNode(int data) { this.data = data; }
    }

    // =========================
    // Q15: Insert at specific position in circular linked list
    public static CNode insertAtPosition(CNode head, int data, int pos) {
        CNode newNode = new CNode(data);
        if (pos == 0) {
            if (head == null) {
                newNode.next = newNode;
                return newNode;
            }
            CNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
            return newNode;
        }
        CNode curr = head;
        for (int i = 0; i < pos - 1; i++) curr = curr.next;
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    // =========================
    // Q16: Delete from specific position in circular linked list
    public static CNode deleteAtPosition(CNode head, int pos) {
        if (pos == 0) {
            CNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = head.next;
            return head.next;
        }
        CNode curr = head;
        for (int i = 0; i < pos - 1; i++) curr = curr.next;
        curr.next = curr.next.next;
        return head;
    }

    // =========================
    // Q17: Search in circular linked list
    public static boolean searchCircular(CNode head, int key) {
        if (head == null) return false;
        CNode temp = head;
        do {
            if (temp.data == key) return true;
            temp = temp.next;
        } while (temp != head);
        return false;
    }
}