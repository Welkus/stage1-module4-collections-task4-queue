package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        Queue<Integer> amountOfDishes = new LinkedList<>();
        List<Integer> dishOrder = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            amountOfDishes.add(i);
        }

        int count = 0;

        while (!amountOfDishes.isEmpty()) {
            count++;
            int current = amountOfDishes.poll();

            if(count%everyDishNumberToEat != 0){
                amountOfDishes.offer(current);
            }else {
                dishOrder.add(current);
            }
        }

        return dishOrder;
    }
}
