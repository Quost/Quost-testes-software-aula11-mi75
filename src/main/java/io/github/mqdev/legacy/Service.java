package io.github.mqdev.legacy;

public class Service {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void resetCount() {
        count = 0;
    }
}
