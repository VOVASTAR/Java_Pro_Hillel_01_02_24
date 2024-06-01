package homework.hw10.coffee.order;

public class MainCoffeeBoard {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.deliver();

        coffeeOrderBoard.add("Alen");
        coffeeOrderBoard.add("Yoda");
        coffeeOrderBoard.add("Rambo");
        coffeeOrderBoard.add("Obi-van");
        coffeeOrderBoard.add("John Snow");

        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver((short) 8);
        coffeeOrderBoard.deliver((short) 4);
        coffeeOrderBoard.deliver((short) 4);
        coffeeOrderBoard.draw();
    }
}
