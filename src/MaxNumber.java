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
        MaxNumber<Integer> maxnum = new MaxNumber<>();
        int result = maxnum.findmax(23,45,34);
        int result1 = maxnum.findmax(67,34,49);
        int result2 = maxnum.findmax(87,38,89);
        System.out.println("The Maximum Number is: "+result);
        System.out.println("The Maximum Number is: "+result1);
        System.out.println("The Maximum Number is: "+result2);
    }
}
