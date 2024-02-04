import java.util.Arrays;
// Generic class
public class MaxNumber<T extends Comparable<T>> {
    private T[] values;
    // T... can take variable number of parameters
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
    public void testMaximum() {
        T result = findMax();
        System.out.println("The Maximum is: " + result);
    }

    public static void main(String[] args) {
        MaxNumber<Integer> maxInt = new MaxNumber<>(5, 12, 8,20,23);
        maxInt.testMaximum();

        MaxNumber<Float> maxFloat = new MaxNumber<>(12.45f, 45.675f, 67.56f,57.45f);
        maxFloat.testMaximum();

        MaxNumber<String> maxStr = new MaxNumber<>("Apple", "Banana", "WaterMelon");
        maxStr.testMaximum();

    }
}
