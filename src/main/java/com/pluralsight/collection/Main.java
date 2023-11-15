package com.pluralsight.collection;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43);
        numbers.add(0);

        System.out.println(numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(4);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());

    }
}
