package homework.hw11_Exception;

public class ArraySizeException extends IllegalArgumentException {
    public ArraySizeException(String message) {
        super(message);
    }
}
