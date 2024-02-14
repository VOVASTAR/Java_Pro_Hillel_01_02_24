package homework.hw5;

public abstract class Animal implements Observer {

    private String name;

    public Animal(String name, Observable... observables) {
        this.name = name;
        for (Observable subject : observables) {
            subject.addAnimalObserver(this);
        }
    }

    public String getName() {
        return name;
    }

    public abstract void run(double obstructedLength);

    public abstract void swim(double obstructedLength);

}


