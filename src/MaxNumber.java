import java.util.Arrays;

// Generic class
public class MaxNumber<T extends Comparable<T>> {
    private T[] values;
    // T... Can take variable number of Parameters as input
    public MaxNumber(T... values) {
        this.values = values;
    }

    public T findMax() {
        if (values == null || values.length == 0) {
            return null;
        }

        Arrays.sort(values);
        return values[values.length - 1];
    }

    private static <U> void printMax(U max) {
        System.out.println("The Maximum is: " + max);
    }

    public void testMaximum() {
        T result = findMax();
        printMax(result);
    }

    public static void main(String[] args) {

        MaxNumber<Integer> maxInt = new MaxNumber<>(5, 12, 8, 20, 15);
        maxInt.testMaximum();

        MaxNumber<Float> maxFloat = new MaxNumber<>(12.45f, 45.675f, 67.56f, 30.0f, 25.5f);
        maxFloat.testMaximum();

        MaxNumber<String> maxStr = new MaxNumber<>("Apple", "Banana", "WaterMelon", "Orange", "Grapes");
        maxStr.testMaximum();
    }
}
