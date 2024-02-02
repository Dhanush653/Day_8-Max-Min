// Generic class
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
        MaxNumber<Float> maxnum = new MaxNumber<>();
        float result = maxnum.findmax(12.45f,45.675f,67.56f);
        float result1 = maxnum.findmax(45.21f,73.5f,43.65f);
        float result2 = maxnum.findmax(21.3f,43.23f,21.67f);
        System.out.println("The Maximum Number is: "+result);
        System.out.println("The Maximum Number is: "+result1);
        System.out.println("The Maximum Number is: "+result2);
    }
}
