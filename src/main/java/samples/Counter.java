package samples;

public class Counter {
    private int value;

    public Counter() {
        value = 0;
    }

    public void increase() {
        value++;
    }

    public void increase(int number) {
        value += number;
    }
    public void decrease() {
        if(value == 0) {
            throw new IllegalStateException("Value cannot be negative");
        }
        value--;
    }

    public int getValue() {
        return value;
    }
}
