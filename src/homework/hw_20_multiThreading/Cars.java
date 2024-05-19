package homework.hw_20_multiThreading;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Cars extends Thread {
    private double fuelAmountToFill;
    private Semaphore activeStation;
    private PetrolStation station;
    private Random random = new Random();

    public Cars(Semaphore semaphore, PetrolStation station, double refill) {
        this.activeStation = semaphore;
        this.station = station;
        this.fuelAmountToFill = refill;
    }

    @Override
    public void run() {
        try {
            activeStation.acquire();
            int pumpingDuration = random.nextInt(7001) + 3000;
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
            activeStation.release();
        }
    }
}

