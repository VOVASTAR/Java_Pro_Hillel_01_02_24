package homework.hw_20_multiThreading.Semaphore;

import java.util.Random;

public class Cars extends Thread {
    private double fuelAmountToFill;
    private PetrolStation station;
    private Random random = new Random();

    public Cars(PetrolStation station, double refill) {
        this.station = station;
        this.fuelAmountToFill = refill;
    }

    @Override
    public void run() {
        try {
            station.getSemaphore().acquire();
            int pumpingDuration = random.nextInt(1001) + 3000;
            sleep(pumpingDuration);
            station.getLocker().lock();
            try {
                station.doRefuel(fuelAmountToFill);
                System.out.println(station.getStorageFuelAmount() + " " + Thread.currentThread().getName());
            } finally {
                station.getLocker().unlock();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            station.getSemaphore().release();
        }
    }
}

