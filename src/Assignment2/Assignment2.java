package Assignment2;

import java.util.*;

/*
 * Data Structure Assignment 2
 * Name: اكتب اسمك هنا
 * Group: اكتب الجروب
 */

public class Assignment2 {

    // =========================
    // Q1: Reverse a string using Stack
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    // =========================
    // Q2: Sort a stack using only another stack
    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            tempStack.push(current);
        }
        return tempStack;
    }

    // =========================
    // Q3: Reverse the order of elements in a queue
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        return queue;
    }

    // =========================
    // Q4: Implement a priority queue (smallest element first)
    static class MinPriorityQueue {
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        void enqueue(int value) {
            pq.add(value);
        }

        int dequeue() {
            return pq.poll();
        }

        boolean isEmpty() {
            return pq.isEmpty();
        }
    }

    // =========================
    // Q5: Merge two sorted queues into one sorted queue
    public static Queue<Integer> mergeSortedQueues(
            Queue<Integer> q1, Queue<Integer> q2) {

        Queue<Integer> result = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                result.add(q1.poll());
            } else {
                result.add(q2.poll());
            }
        }

        while (!q1.isEmpty()) {
            result.add(q1.poll());
        }

        while (!q2.isEmpty()) {
            result.add(q2.poll());
        }

        return result;
    }

    // =========================
    // Main method (اختياري للتجربة)
    public static void main(String[] args) {

        // Test Q1
        System.out.println(reverseString("CyberSecurity"));

        // Test Q2
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        System.out.println(sortStack(stack));

        // Test Q3
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(reverseQueue(queue));

        // Test Q4
        MinPriorityQueue mpq = new MinPriorityQueue();
        mpq.enqueue(5);
        mpq.enqueue(1);
        mpq.enqueue(3);
        System.out.println(mpq.dequeue()); // smallest element

        // Test Q5
        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        Queue<Integer> q2 = new LinkedList<>(Arrays.asList(2, 4, 6));
        System.out.println(mergeSortedQueues(q1, q2));
    }
}