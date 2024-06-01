package edu.hillel.homework.hw20_multiThreading.safeList;

import java.util.Random;

public class MainSafeList {

    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        ThreadSafeList<Integer> list = new ThreadSafeList<>();
        System.out.println(list);

        Thread Creator1 = getCreator(list);
        Thread Creator2 = getCreator(list);
        Creator1.start();
        Creator2.start();
        Creator1.join();
        Creator2.join();

        System.out.println(list);
        System.out.println("Element from index 3 = " + list.get(3));
        list.remove(3);
        System.out.println(list);

        Thread Remover1 = getRemover(list);
        Thread Remover2 = getRemover(list);
        Remover1.start();
        Remover2.start();
        Remover1.join();
        Remover2.join();

        System.out.println(list);
    }

    private static Thread getCreator(ThreadSafeList<Integer> list) {
        return new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                list.add(list.incrementK());
            }
        });
    }

    private static Thread getRemover(ThreadSafeList<Integer> list) {
        return new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                list.remove(random.nextInt(50));
            }
        });
    }
}

