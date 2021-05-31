package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelCalculatorDemo {
    public static void main(String[] args) throws InterruptedException {
        List<int[]> list = new ArrayList<>();
        for (int x = 0; x < 100; x++) {
            list.add(new Random().ints(new Random().nextInt(1000000), 1, 301).toArray());
        }
        ParallelCalculator.calculateWithThreads(list, 1, AnsiColorCode.FG_RED_BOLD_BRIGHT);
        Thread.sleep(1000);
        ParallelCalculator.calculateWithThreads(list, 2, AnsiColorCode.FG_GREEN_BOLD_BRIGHT);
        Thread.sleep(1000);
        ParallelCalculator.calculateWithThreads(list, 5, AnsiColorCode.FG_CYAN_BOLD_BRIGHT);
        Thread.sleep(1000);
        ParallelCalculator.calculateWithThreads(list, 10, AnsiColorCode.FG_YELLOW_BOLD_BRIGHT);
    }
}
