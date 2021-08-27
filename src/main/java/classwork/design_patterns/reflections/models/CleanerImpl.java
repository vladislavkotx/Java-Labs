package classwork.design_patterns.reflections.models;

import classwork.design_patterns.reflections.annotations.Benchmark;
import classwork.design_patterns.reflections.annotations.InjectRandomInt;

import javax.annotation.PostConstruct;

public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min = 3, max = 5)
    private int repeat;

    @PostConstruct
    public void init() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVvvvvvvvvvvvvvvvvv");
        }
    }
}