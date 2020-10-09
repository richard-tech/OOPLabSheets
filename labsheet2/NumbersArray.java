package labsheet2;

public class NumbersArray {
    public static void main(String[] args) {

       double [] numbers = {22.3d, 45.6d, 27.4d, 56.6d, 73.2d, 11.5d, 87.4d, 23.8d};

        System.out.println(largest(numbers));
        System.out.println(average(numbers));
        System.out.println(aboveAverage(numbers,average(numbers)));
    }
    public static double largest(double[] numbers){
        int i;
                double largest=0;
        for(i=0;i<numbers.length;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static double average(double [] numbers){
        double total=0,avg=0;
        for(int i=0;i<numbers.length;i++){
            total += numbers[i];
            avg = total /numbers.length;
        }
        return avg;
    }
    public static String aboveAverage(double [] numbers, double average ){

        String listAboveAverage="";

        for(int i=0; i<numbers.length;i++){
            if(numbers[i] >average) {
                listAboveAverage += numbers[i] + " ";

            }
        }
        return listAboveAverage;
    }
}
