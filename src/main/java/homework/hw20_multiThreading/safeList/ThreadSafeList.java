package homework.hw20_multiThreading.safeList;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeList<T> {

    public static final int INITIAL_CAPACITY = 5;
    private final Lock lock = new ReentrantLock();
    Object[] array;
    int size;
    int k;

    public ThreadSafeList() {
        this.array = new Object[INITIAL_CAPACITY];
    }

    public void add(T t) {
        lock.lock();
        try {
            if (array.length == size) {
                array = Arrays.copyOf(array, (int) (size * 1.6) + 1);
            }
            array[size++] = t;
        } finally {
            lock.unlock();
        }
    }

    public synchronized void remove(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(array, index + 1, array, index, array.length - index - 1);
            array[--size] = null;
        } else {
            throw new IllegalArgumentException("Index - " + index + " is not correct according to length of collection :" + array.length);
        }
    }

    public synchronized T get(int index) {
        if (index > 0 && index < size) {
            return (T) array[index];
        } else {
            throw new IllegalArgumentException("Index - " + index + " is not correct according to length of collection :" + array.length);
        }
    }

    public int incrementK() {
        lock.lock();
        try {
            return k++;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return "ThreadSafeList{" +
                Arrays.toString(array) +
                ", length=" + array.length +
                ", size=" + size +
                '}';
    }

}
