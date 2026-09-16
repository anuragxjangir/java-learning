public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int sum = 0;
        double average = 0;
        for(int i=0 ; i < numbers.length ; i++){
            sum = sum + numbers[i];
            average = (double) sum / numbers.length ;
           
        }
           System.out.println(average);
    }
}
 