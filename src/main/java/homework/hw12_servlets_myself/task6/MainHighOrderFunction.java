package homework.hw12_servlets_myself.task6;

import java.util.List;

public class MainHighOrderFunction {
    public static void main(String[] args) {
        ListOfCars listOfCars = new ListOfCars();
        List<String> cars = listOfCars.getCars();

        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("486f6e6461");
        cars.add("Nissan");
        cars.add("Mercedes");
        cars.add("4d65726365646573");
        cars.add("Bently");
        cars.add("Zaporogec");

        System.out.println(listOfCars.modify());

    }
}
