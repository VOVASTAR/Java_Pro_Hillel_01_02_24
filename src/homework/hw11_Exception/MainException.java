package homework.hw11_Exception;

public class MainException {

    public static void main(String[] args) {
        String[][] validArray = {
                {"2", "5", "6", "2"},
                {"8", "4", "3", "7"},
                {"9", "3", "3", "7"},
                {"4", "6", "1", "2"}};

        String[][] invalidSizeArray = {
                {"2", "5", "6", "2"},
                {"8", "4", "3", "7"},
                {"9", "3", "7"},
                {"4", "6", "1", "2"}};

        String[][] invalidDataArray = {
                {"2", "5", "6", "2"},
                {"8", "4", "3", "7"},
                {"9", "3", "Hello_world", "7"},
                {"4", "6", "1", "2"}};

        ArrayValueCalculator calculator = new ArrayValueCalculator();

        try {
            calculator.doCalc(validArray);
            calculator.doCalc(invalidSizeArray);
            calculator.doCalc(invalidDataArray);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
