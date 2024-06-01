package edu.hillel.homework.hw19_multithreading_1;

import java.util.Arrays;

public class ValueCalculator {

    public static void main(String[] args) throws InterruptedException {
        ValueCalculator calculator = new ValueCalculator();
        calculator.methodConvert();
    }

    private float[] array;
    private float[] firstHalf;
    private float[] secondHalf;
    private int arraySize = 10_000_000;
    private int arrayHalfSize = arraySize / 2;

    public ValueCalculator() {
        array = new float[arraySize];
        firstHalf = new float[arrayHalfSize];
        secondHalf = new float[arrayHalfSize];
    }

    public void methodConvert() throws InterruptedException {
        long start = System.currentTimeMillis();
        Arrays.fill(array, 1);

        System.arraycopy(array, 0, firstHalf, 0, arrayHalfSize);
        System.arraycopy(array, arrayHalfSize, secondHalf, 0, arrayHalfSize);

        Thread thread1 = new Thread(() -> {
            convertValue(firstHalf);
            System.arraycopy(firstHalf, 0, array, 0, arrayHalfSize);
        });

        Thread thread2 = new Thread(() -> {
            convertValue(secondHalf);
            System.arraycopy(secondHalf, 0, array, arrayHalfSize, arrayHalfSize);
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        long finish = System.currentTimeMillis();

        System.out.println("Time spend for convert in two threads: " + (finish - start) + " ms");
    }

    private void convertValue(float[] arrayToConvert) {
        for (int i = 0; i < arrayToConvert.length; i++) {
            arrayToConvert[i] = (float) (arrayToConvert[i]
                    * Math.sin(0.2f + (double) i / 5)
                    * Math.cos(0.2f + (double) i / 5)
                    * Math.cos(0.4f + (double) i / 2));
        }
    }

}
