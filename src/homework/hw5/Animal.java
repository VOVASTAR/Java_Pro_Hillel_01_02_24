package homework.hw5;

public abstract class Animal implements Observer {

    protected static double maxRunningLength;

    private String name;

    public Animal(String name, Observable... observables) {
        this.name = name;
        for (Observable subject : observables) {
            subject.addAnimalObserver(this);
        }
    }

    public void run(double obstructedLength) {
        if (obstructedLength > 0 && obstructedLength <= maxRunningLength) {
            System.out.println(getName() + " run " + obstructedLength + " meters.");
        } else {
            System.out.println(getName() + " can`t run " + obstructedLength + " meters.");
        }
    }

    public abstract void swim(double obstructedLength);

    public String getName() {
        return name;
    }
}


