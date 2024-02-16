package homework.hw5;

public class Main {
    public static void main(String[] args) {

        AnimalObservable catObservable = new AnimalObservable();
        AnimalObservable dogObservable = new AnimalObservable();
        AnimalObservable animalObservable = new AnimalObservable();

        Cat barsik = new Cat("Barsik", catObservable, animalObservable);
        Cat murzik = new Cat("Murzik", catObservable, animalObservable);
        Dog bobik = new Dog("Bobik", dogObservable, animalObservable);
        Dog tuzik = new Dog("Tuzik", dogObservable, animalObservable);
        Cat barsik1 = new Cat("Barsik", catObservable, animalObservable);
        Cat vaska = new Cat("Vaska", catObservable, animalObservable);

        barsik.run(201);
        barsik.swim(19);
        murzik.run(200);
        bobik.run(500);
        bobik.swim(11);
        tuzik.run(501);
        tuzik.swim(10);
        barsik1.run(150);
        barsik1.swim(5);
        vaska.run(199);
        vaska.swim(0);

        System.out.println("Cat population: " + catObservable.checkPopulation());
        System.out.println("Dog population: " + dogObservable.checkPopulation());
        System.out.println("Animal population: " + animalObservable.checkPopulation());
    }
}
