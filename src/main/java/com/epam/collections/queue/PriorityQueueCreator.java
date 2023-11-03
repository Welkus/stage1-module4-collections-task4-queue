package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        PriorityQueue<String> list = new PriorityQueue<>(Comparator.reverseOrder());

        list.addAll(firstList);
        list.addAll(secondList);

        return list;
    }
}
