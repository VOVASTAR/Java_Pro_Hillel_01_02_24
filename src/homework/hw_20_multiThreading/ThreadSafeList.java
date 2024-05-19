package homework.hw_20_multiThreading;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList<T> {

    List<T> threadSafeList = new ArrayList<>();

    public synchronized void add(T t) {
        threadSafeList.add(t);
    }

    public synchronized void remove(T t) {
        threadSafeList.remove(t);
    }

    public synchronized T get(int index) {
        return threadSafeList.get(index);
    }

}
