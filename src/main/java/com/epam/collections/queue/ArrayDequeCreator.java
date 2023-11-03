package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> firstDeck = new ArrayDeque<>(firstQueue);
        ArrayDeque<Integer> secondDeck = new ArrayDeque<>(secondQueue);
        ArrayDeque<Integer> combinedDeck = new ArrayDeque<>();

        combinedDeck.offer(firstDeck.poll());
        combinedDeck.offer(firstDeck.poll());
        combinedDeck.offer(secondDeck.poll());
        combinedDeck.offer(secondDeck.poll());



        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {

            firstDeck.offer(combinedDeck.poll());
            combinedDeck.offer(firstDeck.poll());
            combinedDeck.offer(firstDeck.poll());

            if (!secondDeck.isEmpty()) {
                secondDeck.offer(combinedDeck.poll()); // Take the top card and add it to the end of the player's deck
                combinedDeck.offer(secondDeck.poll()); // Put two cards from the player's deck into the combined deck
                combinedDeck.offer(secondDeck.poll());
            }


        }

        return combinedDeck;
    }
}
