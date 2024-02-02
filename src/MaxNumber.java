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
        MaxNumber<String> maxnum = new MaxNumber<>();
        String result = maxnum.findmax("Apple","Banana","WaterMelon");
        String result1 = maxnum.findmax("India","Canada","England");
        String result2 = maxnum.findmax("Pumpkin","Carrot","Potato");
        // Based on Unicode Value Of The String
        System.out.println("The Maximum String is: "+result);
        System.out.println("The Maximum String is: "+result1);
        System.out.println("The Maximum String is: "+result2);
    }
}
