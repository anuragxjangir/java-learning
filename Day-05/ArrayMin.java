public class ArrayMin {
    public static void main(String[] args) {

        int[] numbers = { 34, 12, 56, 7, 89, 23 };
        int min = numbers[0];

        
        for(int i=0 ; i<numbers.length ; i++){

            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
