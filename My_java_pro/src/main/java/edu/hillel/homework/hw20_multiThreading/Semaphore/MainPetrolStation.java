package edu.hillel.homework.hw20_multiThreading.Semaphore;

public class MainPetrolStation {

    public static void main(String[] args) {

        PetrolStation petrolStation = new PetrolStation(3);

        Cars car1 = new Cars(petrolStation, 4.3);
        Cars car2 = new Cars(petrolStation, 2.3);
        Cars car3 = new Cars(petrolStation, 4.8);
        Cars car4 = new Cars(petrolStation, 3.5);
        Cars car5 = new Cars(petrolStation, 2.9);
        Cars car6 = new Cars(petrolStation, 6.9);

        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
        car6.start();

    }

}
