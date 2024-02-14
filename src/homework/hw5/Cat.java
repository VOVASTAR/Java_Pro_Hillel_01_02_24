package homework.hw5;

public class Cat extends Animal {

    public static final double MAX_RUNNING_LENGTH = 200;

    public Cat(String name, Observable... observables) {
        super(name, observables);
    }

    @Override
    public void run(double obstructedLength) {
        if (obstructedLength > 0 && obstructedLength <= MAX_RUNNING_LENGTH) {
            System.out.println(getName() + " run " + obstructedLength + " meters.");
        } else {
            System.out.println(getName() + " can`t run " + obstructedLength + " meters.");
        }
    }

    @Override
    public void swim(double obstructedLength) {
        System.out.println(getName() + " can`t swim.");
    }
}
