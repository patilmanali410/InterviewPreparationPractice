package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueueAndLinkedList {
    public static void practiceQueueAndLinkedListFunctions() {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());

    }
}
