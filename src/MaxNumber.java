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
        MaxNumber<Integer> maxint = new MaxNumber<>();
        Integer intResult = maxint.findmax(5, 12, 8);
        Integer intResult1 = maxint.findmax(45, 52, 17);
        Integer intResult2 = maxint.findmax(55, 82, 82);
        System.out.println("The Maximum Integer Number is:"+intResult);
        System.out.println("The Maximum Integer Number is:"+intResult1);
        System.out.println("The Maximum Integer Number is:"+intResult2);
        System.out.println();

        MaxNumber<Float> maxnum = new MaxNumber<>();
        float floatresult = maxnum.findmax(12.45f,45.675f,67.56f);
        float floatresult1 = maxnum.findmax(45.21f,73.5f,43.65f);
        float floatresult2 = maxnum.findmax(21.3f,43.23f,21.67f);
        System.out.println("The Maximum Float Number is: "+floatresult);
        System.out.println("The Maximum Float Number is: "+floatresult1);
        System.out.println("The Maximum Float Number is: "+floatresult2);
        System.out.println();

        MaxNumber<String> maxstr = new MaxNumber<>();
        String strresult = maxstr.findmax("Apple","Banana","WaterMelon");
        String strresult1 = maxstr.findmax("India","Canada","Finland");
        String strresult2 = maxstr.findmax("Samsung","Mi","Oppo");
        // Based on Unicode Value Of The String
        System.out.println("The Maximum String Number is: "+strresult);
        System.out.println("The Maximum String Number is: "+strresult1);
        System.out.println("The Maximum String Number is: "+strresult2);
    }
}