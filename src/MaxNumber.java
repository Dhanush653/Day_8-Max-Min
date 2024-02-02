
public class MaxNumber<T extends Comparable<T>> {
    public T findmax(T num1, T num2, T num3){
        T max = num1;
        if(num2.compareTo(max) > 0){
            max = num2;
        }
        if(num3.compareTo(max) > 0){
            max = num3;
        }
        return max;
    }
    public static void main(String[] args) {
        MaxNumber<Integer> maxnum = new MaxNumber<Integer>();
        int result = maxnum.findmax(23,45,34);
        System.out.println(result);
    }
}
